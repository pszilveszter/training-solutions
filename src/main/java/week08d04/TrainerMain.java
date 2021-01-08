package week08d04;

public class TrainerMain {
    public static void main(String[] args) {
        Trainer goodTrainer = new Trainer(new GoodMood());
        Trainer badTrainer = new Trainer(new BadMood());

        System.out.println(goodTrainer.giveMark());
        System.out.println(badTrainer.giveMark());
    }
}
