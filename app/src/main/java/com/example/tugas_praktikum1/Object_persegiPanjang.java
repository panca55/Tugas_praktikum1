package com.example.tugas_praktikum1;

public class Object_persegiPanjang {
        private int panjang;
        private int lebar;
        public void setPanjang (int panjang){
            this.panjang = panjang;
        }
        public void setLebar (int lebar){this.lebar = lebar;}
        public int hitungKeliling(){
            return (2*panjang) + (2*lebar);
        }
        public static void main(String[] args) {
            Object_persegiPanjang PersegiPanjang = new Object_persegiPanjang();
            PersegiPanjang.setPanjang(8);
            PersegiPanjang.setLebar(10);

            int Keliling = PersegiPanjang.hitungKeliling();
            System.out.println("Panjang: " + PersegiPanjang.panjang);
            System.out.println("Lebar: " + PersegiPanjang.lebar);
            System.out.println("Keliling Persegi Panjang: " +"2(" + PersegiPanjang.panjang + ") + 2(" + PersegiPanjang.lebar +") = "+ Keliling);
        }
}

