public class WordsFactory {
    public KeepWordsLength wordMethodCreate(EWordsType type){
        KeepWordsLength method = null;

        switch (type) {
            case VOWELS:
                method = new KeepWordsLength();
                break;
            case CONSONANTS:
                method = new RemovingWordsConsonantsEnd();
                break;
        }
        return method;
    }
}
