
public class ClassStack25 {
    int size;
    int top;
    Pakaian25 data[];

    public ClassStack25(int size) {
        this.size = size;
        data = new Pakaian25[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Pakaian25 pkn) {
        if (!IsFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            Pakaian25 x = data[top];
            top--;
            System.out.println(
                    "Data yang keluar: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        System.out.println("Elemen teratas: " + data[top].jenis + " " +
                data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }

    public void print() {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " "
                    + data[i].harga + " ");
        }
        System.out.println("");
    };

    public void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }

     public void getMax() {
        double hargaMax =0;
        int indexMax = -1;
        for (int i = top; i >= 0; i--) {
            if(data[i].harga > hargaMax ){
                hargaMax = data[i].harga;
                indexMax = i;
            }
        }
        System.out.println(data[indexMax].jenis + " " + data[indexMax].warna + " " + data[indexMax].merk + " " + data[indexMax].ukuran + " "
        + data[indexMax].harga + " ");
        System.out.println();
    }
}
