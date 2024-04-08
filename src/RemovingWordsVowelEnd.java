public class RemovingWordsVowelEnd implements IRemovingWords {
    private static RemovingWordsVowelEnd INSTANCE;
    private int _length;

    private RemovingWordsVowelEnd() {
    }

    public static RemovingWordsVowelEnd getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RemovingWordsVowelEnd();
        }
        return INSTANCE;
    }

    public void setLength(int length) {
        _length = length;
    }

    public int getLength() {
        return _length;
    }

    @Override
    public String removeWordsEndingWith(String _text) {
        String _endWith = "[aeiouyAEIOUY]";
        return _text.replaceAll("\\b\\w{" + (_length - 1) + "}" + _endWith + "\\b", "").replaceAll("\\s{2,}", " ").trim();
    }
}
