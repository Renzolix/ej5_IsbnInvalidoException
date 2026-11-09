public class LibroCatalogado {
    private String isbn;

    public LibroCatalogado(String isbn) {
        // Validación defensiva en el constructor
        if (isbn == null || isbn.trim().isEmpty() || isbn.trim().length() != 13) {
            throw new IsbnInvalidoException("El ISBN debe ser no nulo, no vacío y contener exactamente 13 caracteres. Recibido: " + isbn);
        }
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public static void main(String[] args) {
        System.out.println("Instanciando libro con ISBN válido de 13 caracteres...");
        LibroCatalogado l1 = new LibroCatalogado("9789500700100");
        System.out.println("ISBN asignado: " + l1.getIsbn());

        System.out.println("\nIntentando instanciar libro con ISBN inválido ('12345')...");
        try {
            LibroCatalogado l2 = new LibroCatalogado("12345");
        } catch (IsbnInvalidoException e) {
            System.err.println("Excepción Runtime capturada: " + e.getMessage());
        }
    }
}