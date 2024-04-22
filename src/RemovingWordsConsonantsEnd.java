public class RemovingWordsConsonantsEnd extends KeepWordsLength{

    @Override
    public String removeWordsEndingWith(String _text, int _lengthToRemove) {
        String _endWith = "[bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ]";
        
        return _text.replaceAll("\\b\\w{" + (_lengthToRemove - 1) + "}" + _endWith + "\\b", "").replaceAll("\\s{2,}", " ").trim();
    }
}
