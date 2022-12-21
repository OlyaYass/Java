public class ImageDocument implements IDocument {
    @Override
    public String newDocument() {
        return "new Image document";
    }
    @Override
    public String openDocument() {
        return "open Image document";
    }
}
