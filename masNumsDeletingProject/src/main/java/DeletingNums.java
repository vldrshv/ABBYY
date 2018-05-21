/**
 * Алгоритм работает следующим образом:
 * идем по массиву от i = 0 до arr.length. Встречая число arr[i] равное Х запоминаем положение данного числа и идем
 * по массиву дальше, пока не найдем число не равное X. Запоминаем позицию данного числа в переменную change_pos и
 * меняем числа arr[i] и arr[change_pos] местами.
 *
 * Далее продолжаем идти по i. Если встречаем число arr[i] равное Х, то запоминаем положение данного числа и
 * идем по массиву дальше со значения arr[change_pos+1] пока не найдем число, не равное Х.
 *
 * Алгоритм завершается в двух случаях:
 *
 * 1)   i = arr.length
 * 2)   change_pos = arr.length
 *
 * Первый случай дает остановку, если мы не встретили в массиве числа, равного Х
 * Второй случай дает остановку, если нет больше чисел, которые не равны Х
 *
 * Количесвто итераций - algoLvl, показывает количество вхождений в каждый цикл, необязательная строка
 */
public class DeletingNums implements IDeleteNumFromArray{
    public int deleteNumFromArray(int[] arr, int x){
        int algoLvl = 0;
        int size = arr.length;
        int n = arr.length;
        int change_pos = 0;
        for (int i = 0; change_pos < n-1 && i < n; i++) {
            algoLvl++;
            if (arr[i] == x) {
                for (int j = change_pos + 1; j < n; j++) {
                    algoLvl++;
                    if (arr[j] != x) {
                        arr[i] = arr[j];
                        arr[j] = x;
                        break;
                    }
                    change_pos++;
                }
            }
            else{
                change_pos++;
            }
        }
        while(size > 0){
            if (arr[size-1] == x)
                size --;
            else
                break;
        }
        System.out.println("res.length = " + size + ", mas.length = " + n + ", algo_lvl = " + algoLvl);
        return size;
    }
}
