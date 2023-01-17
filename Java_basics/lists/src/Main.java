public class Main {
    public static void main(String[] args) {
        LanguageList languageList = new LanguageList();
        System.out.println(languageList.isEmpty());
        languageList.addLanguage("Kotlin");
        languageList.addLanguage("Python");
        languageList.addLanguage("Scala");
        languageList.removeLanguage("Scala");
        String kotlin = languageList.firstLanguage(); // "Kotlin"
        System.out.println(kotlin + " => Kotlin");
        int two = languageList.count();
        System.out.println(two + " => 2");
        boolean learningPython = languageList.containsLanguage("Python");
        System.out.println(learningPython + " => true");
        boolean learningRuby = languageList.containsLanguage("Ruby");
        System.out.println(learningRuby + " => false");
        boolean result = languageList.isExciting();
        System.out.println(result + " => true");
        System.out.println(new LanguageList().isExciting() + " => false");
    }
}