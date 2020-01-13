/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import method.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projectlaundry.ProgramLaundry;
import projectlaundry.Regist;
import projectlaundry.LoginLaundry;

/**
 *
 * @author Doni
 */
public class Testing {
    
    int a = laundry.a;
    public Testing() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 
    
    @Test
    public void testTotal(){
        System.out.println("Hitung Total Transaksi");
        int valueKg = 2;
        int valueCuci = 28000;
        ProgramLaundry obj = new ProgramLaundry();
        int expected = 56000;
        int result = obj.Hitung(valueKg, valueCuci);
        assertEquals(expected, result);
    }
    
    
    @Test
    public void testReset(){
        System.out.println("Reset Kolom Order");
        ProgramLaundry obj = new ProgramLaundry();
        String reset = obj.reset();
        assertNull(reset);
    }
    @Test
    public void testJenisBaju(){      
        System.out.println("Pilihan Jenis Baju");
        String Jenis = "Baju";
        String expected="5000";
       laundry obj = new laundry();
      String result = obj.jenis(Jenis);
       assertEquals(expected, result);
    }
    @Test
    public void testJenisGorden(){
        System.out.println("Pilihan Jenis Gorden");
        String Jenis = "Gorden";
       String expected="20000";
       laundry obj = new laundry();
      String result = obj.jenis(Jenis);
       assertEquals(expected, result);
    }
    @Test
    public void testJenisBoneka(){
        System.out.println("Pilihan Jenis Boneka");
        String Jenis = "Boneka";
       String expected="8000";
       laundry obj = new laundry();
      String result = obj.jenis(Jenis);
       assertEquals(expected, result);
    }
    @Test
    public void testJenisJas(){
        System.out.println("Pilihan Jenis Jas");
        String Jenis = "Jas";
       String expected="18000";
       laundry obj = new laundry();
      String result = obj.jenis(Jenis);
       assertEquals(expected, result);
    }
    @Test 
    public void testBajuCks(){
        System.out.println("Pilihan Jenis Baju Dengan CKS");
        String Jenis = "Baju";
       String category = "Cuci + Kering + Setrika";
        String expected="8000";
       laundry obj = new laundry();
      String result = obj.kategori(category, Jenis);
       assertEquals(expected, result);
    }
    @Test 
    public void testBajuCk(){
        System.out.println("Pilihan Jenis Baju Dengan CK");
        String Jenis = "Baju";
       String category = "Cuci + Kering";
        String expected="7000";
       laundry obj = new laundry();
      String result = obj.kategori(category, Jenis);
       assertEquals(expected, result);
    }
    @Test 
    public void testBajuS(){
        System.out.println("Pilihan Jenis Baju Dengan Setrika");
        String Jenis = "Baju";
       String category = "Setrika";
        String expected="6000";
       laundry obj = new laundry();
      String result = obj.kategori(category, Jenis);
       assertEquals(expected, result);
    }
     @Test 
    public void testGordenCks(){
        System.out.println("Pilihan Jenis Gorden Dengan CKS");
        String Jenis = "Gorden";
       String category = "Cuci + Kering + Setrika";
        String expected="28000";
       laundry obj = new laundry();
      String result = obj.kategori(category, Jenis);
       assertEquals(expected, result);
    }@Test 
    public void testGordenCk(){
        System.out.println("Pilihan Jenis Gorden Dengan CKS");
        String Jenis = "Gorden";
       String category = "Cuci + Kering";
        String expected="27000";
       laundry obj = new laundry();
      String result = obj.kategori(category, Jenis);
       assertEquals(expected, result);
    }
    @Test 
    public void testGordenS(){
        System.out.println("Pilihan Jenis Gorden Dengan SEtrika");
        String Jenis = "Gorden";
       String category = "Setrika";
        String expected="26000";
       laundry obj = new laundry();
      String result = obj.kategori(category, Jenis);
       assertEquals(expected, result);
    }
    @Test 
    public void testBonekaCks(){
        
        System.out.println("Pilihan Jenis Boneka Dengan CKS");
        String Jenis = "Boneka";
       String category = "Cuci + Kering + Setrika";
        String expected="16000";
       laundry obj = new laundry();
      String result = obj.kategori(category, Jenis);
       assertEquals(expected, result);
    }
    @Test 
    public void testBonekaCk(){
        System.out.println("Pilihan Jenis Boneka Dengan CK");
        String Jenis = "Boneka";
       String category = "Cuci + Kering";
        String expected="15000";
       laundry obj = new laundry();
      String result = obj.kategori(category, Jenis);
       assertEquals(expected, result);
    }
    @Test 
    public void testBonekas(){
        System.out.println("Pilihan Jenis Boneka Dengan CKS");
        String Jenis = "Boneka";
       String category = "Setrika";
        String expected="14000";
       laundry obj = new laundry();
      String result = obj.kategori(category, Jenis);
       assertEquals(expected, result);
    }
    @Test 
    public void testJasCks(){
        System.out.println("Pilihan Jenis Jas Dengan CKS");
        String Jenis = "Jas";
       String category = "Cuci + Kering + Setrika";
        String expected="26000";
       laundry obj = new laundry();
      String result = obj.kategori(category, Jenis);
       assertEquals(expected, result);
    }
    @Test 
    public void testJasCk(){
        System.out.println("Pilihan Jenis Jas Dengan CK");
        String Jenis = "Jas";
       String category = "Cuci + Kering";
        String expected="25000";
       laundry obj = new laundry();
      String result = obj.kategori(category, Jenis);
       assertEquals(expected, result);
    }
    @Test 
    public void testJasS(){
        System.out.println("Pilihan Jenis Jas Dengan Setrika");
        String Jenis = "Jas";
       String category = "Setrika";
        String expected="24000";
       laundry obj = new laundry();
      String result = obj.kategori(category, Jenis);
       assertEquals(expected, result);
    }
    @Test
    public void regist(){
        System.out.println("Registrasi");
       String expected="Sukses";
       Regist obj = new Regist();
      String result = obj.doRegis("faiz","123");
       assertEquals(expected, result);
    }
    @Test
    public void login(){
        System.out.println("Login");
       regist();
        String expected="sukses";
       LoginLaundry obj = new LoginLaundry();
      String result = obj.doLogin("faiz","123");
       assertEquals(expected, result);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
 