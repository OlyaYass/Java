public class MusicDocument implements IDocument {
    @Override
    public String newDocument() {
        return "new Music document";
    }
    @Override
    public String openDocument() {
        return "open Music document";
    }
}
