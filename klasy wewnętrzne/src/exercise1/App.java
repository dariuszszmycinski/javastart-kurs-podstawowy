package exercise1;

public class App {
    public static void main(String[] args) {
        Sortable sorter = new Sortable() {
            @Override
            public void sort(int[] tab) {
               int n = tab.length;
               do {
                   for (int i = 0; i < n-1; i++) {
                       if (tab[i]>tab[i+1]){
                           int temp = tab[i];
                           tab[i]=tab[i+1];
                           tab[i+1]=temp;
                       }
                   }
                   n--;
               }while (n>1);
            }
        };

        int[] tab = {15,25,3,65,2,99};
        sorter.sort(tab);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
