import java.util.regex.Matcher;
import java.util.regex.Pattern;

//public class KeepWordsLength extends RemovingWordsVowelEnd {
//
//    public String keepWordsOfSpecifiedLength(String _text, int _lengthToKeep) {
//        // Создаем регулярное выражение для слов указанной длины
//        String _regex = "\\b\\w{" + _lengthToKeep + "}\\b";
//        Pattern _pattern = Pattern.compile(_regex);
//        Matcher _matcher = _pattern.matcher(_text);
//
//        StringBuilder _result = new StringBuilder();
//
//        // Ищем совпадения и добавляем их в результат
//        // Когда вызывается _matcher.find() объект Matcher перемещается к следующему совпадению в тексте
//        // _matcher.group() его возвращает
//        while (_matcher.find()) {
//            _result.append(_matcher.group()).append(" ");
//        }
//
//        return _result.toString();
//    }
//}
