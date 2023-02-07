package lesson_32.task_2.intefaces;

import lesson_19.task_1.ICopyUtils;


/**
 * Задача копирования файла в отдельном потоке
 * 
 * @author nedis
 * @version 1.0
 */
public interface CopyFileTask extends Task {
	/**
	 * Устанавливает алгоритм копирования файлов. созданный в предыдущем задании
	 * 
	 * @param copyUtils алгоритм копирования файлов
	 */
	void setFileCopyUtils(ICopyUtils copyUtils);
}
