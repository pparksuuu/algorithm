package 기초코딩테스트;

import java.io.File;
import java.io.FileFilter;

public class 파일클래스로절대경로내파일만목록으로출력 {
	public static void main(String[] args) {
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		String s = "IBK";
		File dir = new File(classLoader.getResource("IBK".replace(".", "/")).getPath());
		
		
		if (!dir.isDirectory())
			return;
		
		findAndPrintNames(dir, s);
	}
	
	private static void findAndPrintNames(File dir, String packageName) {
		File[] files = dir.listFiles(new FileFilter() {
			public boolean accept(File pathname) {
				if (pathname.isDirectory() ||
						(pathname.getName().endsWith(".class") &&
								!pathname.getName().contains("$"))) {
					return true;
				}
				return false;
			}
		});
		
		for (File f : files) {
			if (f.isDirectory()) {
				findAndPrintNames(f, packageName + "." + f.getName());
				continue;
			}
			System.out.println(f.getName().substring(0, f.getName().lastIndexOf(".")));
		}
		
	}
}
