import java.util.Scanner;

public class EcommerceBinarySearch {

    public static void main(String[] args) {

        String[] products = {
            "Camera",
            "Headphones",
            "Laptop",
            "Mobile",
            "Smartwatch",
            "Tablet"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product to search: ");
        String key = sc.nextLine();

        int low = 0;
        int high = products.length - 1;
        int pos = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareToIgnoreCase(products[mid]);

            if (result == 0) {
                pos = mid + 1;
                break;
            } else if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (pos != -1)
            System.out.println("Product Found at Position: " + pos);
        else
            System.out.println("Product Not Found");

        sc.close();
    }
}
