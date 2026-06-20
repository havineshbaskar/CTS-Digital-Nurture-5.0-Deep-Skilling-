interface Document {
    void open();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Word Document Opened");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("PDF Document Opened");
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Excel Document Opened");
    }
}

class Factory {
    public Document getDocument(String type) {
        if (type.equals("Word")) {
            return new WordDocument();
        } else if (type.equals("PDF")) {
            return new PdfDocument();
        } else if (type.equals("Excel")) {
            return new ExcelDocument();
        }
        return null;
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        Factory f = new Factory();

        Document d1 = f.getDocument("Word");
        d1.open();

        Document d2 = f.getDocument("PDF");
        d2.open();

        Document d3 = f.getDocument("Excel");
        d3.open();
    }
}
