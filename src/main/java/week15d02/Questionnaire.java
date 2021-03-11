package week15d02;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Questionnaire {

    private static final int POS_TOPIC = 2;
    private static final int POS_ANSWER = 0;
    private static final int POS_POINT = 1;
    private List<Question> questions = new ArrayList<>();


    public Questionnaire(InputStream input) {
        readFile(input);
    }


    public List<String> getQuestionsOf(String topic) {
        List<String> result = new ArrayList<>();
        for (Question q: questions) {
            if (topic.equals(q.getSubject())) {
                result.add(q.getProblem());
            }
        }
        if (result.isEmpty()) {
            throw new IllegalArgumentException(String.format("Topic: %s is not found", topic));
        }
        return result;
    }


    public Question getDataOfRandomQuestion(Random random) {
         int index = random.nextInt(questions.size());
         return questions.get(index);
    }


    public Map<String, List<Question>> getAllQuestionBySubject() {
        Map<String, List<Question>> result = new HashMap<>();
        for (Question q: questions) {
            String subject = q.getSubject();
            if (!result.containsKey(subject)) {
                result.put(subject, new ArrayList<>());
            }
            result.get(subject).add(q);
        }
        return result;
    }


    public String getHeaviestSubject() {
        int points = 0;
        String subject = null;
        for (String s: getAllQuestionBySubject().keySet()) {
            int p = getSumBySubject(s);
            if (points < p) {
                points = p;
                subject = s;
            }
        }
        return subject;
    }


    public List<Question> getQuestions() {
        return List.copyOf(questions);
    }


    private int getSumBySubject(String subject) {
        int sum = 0;
        for (Question q: questions) {
            if (subject.equals(q.getSubject())) {
                sum += q.getPoints();
            }
        }
        return sum;
    }


    private void readFile(InputStream is) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            String line1;
            String line2;

            while ((line1 = reader.readLine()) != null) {
                if ((line2 = reader.readLine()) != null) {
                    fillQuestionnaire(line1, line2);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Unable to load file", ioe);
        }
    }


    private void fillQuestionnaire(String line1, String line2) {
        String[] data = splitLine(line2);
        Question q = new Question(line1, data[POS_ANSWER], Integer.parseInt(data[POS_POINT]), data[POS_TOPIC]);
        questions.add(q);
    }


    private String[] splitLine(String line) {
        String[] items = new String[3];

        int indexOfAnswer = line.indexOf(" ");
        int indexOfPoint = line.indexOf(" ", indexOfAnswer + 1);

        items[POS_ANSWER] = line.substring(0, indexOfAnswer);
        items[POS_POINT] = line.substring(indexOfAnswer + 1, indexOfPoint);
        items[POS_TOPIC] = line.substring(indexOfPoint + 1);
        return items;
    }
}