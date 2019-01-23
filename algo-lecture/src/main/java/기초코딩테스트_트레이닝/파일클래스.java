package 기초코딩테스트_트레이닝;

import java.io.File;
import java.io.FileFilter;

public class 파일클래스 {
	public static void main(String[] args) {
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		String s = "IBK_Training";
		File dir = new File(classLoader.getResource("IBK_Training".replace(".", "/")).getPath());
		
		if (!dir.isDirectory())
			return;
		
		findAndPrintNames(dir, s);
	}
	
	private static void findAndPrintNames(File dir, String pakcageName) {
		File[] files = dir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if (pathname.isDirectory() || 
						(pathname.getName().endsWith(".class"))
						&& !pathname.getName().contains("$"))
					return true;
				return false;
			}
		});
		
		for (File f : files) {
			System.out.println(f.getName().substring(0, f.getName().lastIndexOf(".")));
		}
	}
}
