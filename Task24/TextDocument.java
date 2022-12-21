public class TextDocument implements IDocument {
    @Override
    public String newDocument() {
        return "new Text document";
    }
    @Override
    public String openDocument() {
        return "open Text document";
    }
}