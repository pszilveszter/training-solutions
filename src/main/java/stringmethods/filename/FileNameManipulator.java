package stringmethods.filename;

public class FileNameManipulator {

    public char findLastCharacter(String str) {
        if (isEmpty(str)) {
            throw new IllegalArgumentException("Empty string!");
        }
        str = str.strip();
        return str.charAt(str.length() - 1);
    }


    public String findFileExtension(String fileName) {
        if (isFileNameInvalid(fileName)) {
            throw new IllegalArgumentException("Invalid file name!");
        }
        fileName = fileName.strip();
        return fileName.substring(fileName.lastIndexOf("."));
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        if (isExtensionInvalid(ext) || isFileNameInvalid(fileName)) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        fileName = fileName.strip();
        ext = ext.strip();
        return fileName.endsWith(ext);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        if (isFileNameInvalid(searchedFileName) || isFileNameInvalid(actualFileName)) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        return searchedFileName.strip().equalsIgnoreCase(actualFileName.strip());
    }

    public String changeExtensionToLowerCase(String fileName) {
        if (isEmpty(fileName)) {
            throw new IllegalArgumentException("Empty string!");
        }
        if (isFileNameInvalid(fileName)) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        return fileName.substring(0, fileName.lastIndexOf(".")).concat(findFileExtension(fileName).toLowerCase());
    }

    public String replaceStringPart(String fileName, String present, String target) {
        if (isEmpty(fileName) || isEmpty(target)) {
            throw new IllegalArgumentException("Empty string!");
        }
        if (!fileName.contains(present)) {
            return fileName;
        }
        return fileName.replace(present, target);
    }

    private boolean isEmpty(String s) {
        return s == null || s.isBlank();
    }

    private boolean isFileNameInvalid(String s) {
        return s == null || s.strip().length() < 3 || s.indexOf(".") == 0 || s.lastIndexOf(".") == s.length() - 1;
    }

    private boolean isExtensionInvalid(String s) {
        return s == null || s.strip().isEmpty();
    }
}
