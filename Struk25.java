

public class Struk25 {
        int noTransaksi, jumlahBarang;
        String tglBeli;
        int totalBayar;
        int size;
        int top;
        Struk25 data[];
        Struk25[] stk;
        
        Struk25(int no, String tgl, int jb, int tb){
            noTransaksi = no;
            tglBeli = tgl;
            jumlahBarang = jb;
            totalBayar = tb;
        }
        
        public Struk25(int size){
            this.size = size;
            data = new Struk25[size];
            top = -1;
        }
        
        public boolean isEmpty(){
            return top == -1;
        }
        
        public boolean isFull(){
            return top == size - 1;
        }
        
        
        public void push(Struk25 dt){
            if (!isFull()) {
                top++;
                data[top] = dt;
            } else {
                System.out.println("Isi Stack Penuh!");
            }
        }
        
        public void pop(){
            if (!isEmpty()) {
                Struk25 x = data[top];
                top--;
                System.out.println("Data yang keluar: " + x.noTransaksi + " " 
                        + x.tglBeli + " " + x.jumlahBarang + " "
                        + x.totalBayar + " ");
            } else {
                System.out.println("Stack masih kosong");
            }
            
        }
        
            public void peek(){
            System.out.println("Elemen teratas: " + data[top].noTransaksi + " "
                               + " " + data[top].tglBeli + " " + data[top].jumlahBarang
                               + " " + data[top].totalBayar);
        }
        
        public void print(){
            System.out.println("Isi stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(data[i].noTransaksi + " " + data[i].tglBeli + " "
                                   + data[i].jumlahBarang + " " + data[i].totalBayar + 
                                   " ");
            }
            System.out.println("");
        }
        
        public void clear(){
            if (!isEmpty()) {
                for (int i = top; i >= 0; i--) {
                    top--;
                }
                System.out.println("Stack sudah dikosongkan");
            } else {
                System.out.println("Gagal! Stack masih kosong");
            }
        }

        
}