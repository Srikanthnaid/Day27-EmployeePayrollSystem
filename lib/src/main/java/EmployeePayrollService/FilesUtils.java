package EmployeePayrollService;

import java.io.File;

public class FilesUtils {
	public static boolean deleteFiles(File contentToDelete) {
		File[] allContents = contentToDelete.listFiles();
		if (allContents != null) {
			for (File eachFile : allContents) {
				deleteFiles(eachFile);
			}
		}
		return contentToDelete.delete();
	}
}
