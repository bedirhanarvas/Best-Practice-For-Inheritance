package inheritanceDemo;

public class Main {
	public static void main(String[] args) {
		OgretmenKrediManager ogretmenkrediManager = new OgretmenKrediManager();
		
		ogretmenkrediManager.hesapla();
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(ogretmenkrediManager);
		
	}

}
