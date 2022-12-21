public class ImageDocumentFactory implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new ImageDocument();
    }

    @Override
    public IDocument createOpen() {

        return new ImageDocument();
    }
}
