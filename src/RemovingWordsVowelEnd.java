public class RemovingWordsVowelEnd implements IRemovingWords {
    private static RemovingWordsVowelEnd _instance;
    private int _length;

    private RemovingWordsVowelEnd() {
    }

    public static RemovingWordsVowelEnd getInstance() {
        if (_instance == null) {
            _instance = new RemovingWordsVowelEnd();
        }
        return _instance;
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
