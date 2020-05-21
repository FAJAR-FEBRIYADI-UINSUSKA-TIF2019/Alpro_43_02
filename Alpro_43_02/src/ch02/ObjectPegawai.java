package ch02; 

public class ObjectPegawai { 
	public static void main(String[] args) { 
		Pegawai pgwl = new Pegawai(); 
		Pegawai pgw2 = new Pegawai(); 
		
		pgwl.nik = "123"; 
		pgwl.nama = "Budi"; 
		pgwl.jabatan = "Staff"; 
		pgwl.isAktif = true; 
		
		pgw2.nik = "124"; 
		pgw2.nama = "Cici"; 
		pgw2.jabatan = "Administrasi"; 
		pgw2.isAktif = true; 
		
		pgwl.cetak(); 
		System.out.println ("==========="); 
		pgw2.cetak(); 
	} 
} 