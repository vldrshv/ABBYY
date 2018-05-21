/**
 * Алгоритм, который был написан на собеседовании, работает следующим образом:
 *
 * вводим переменную size, которая будет возвращаемым значением длинны нового массива. Изначально
 * size = arr.length. Идем по массиву от i = 0 до size. Встречая число arr[i] равное Х сдвигаем его циклом в конец,
 * уменьшая переменную size. Конец определяется размером size, что позволяет делать size-i-1 сдвигов.
 *
 *
 * Алгоритм завершается, когда i >= size.
 *
 * Количесвто итераций - algoLvl, показывает количество вхождений в каждый цикл, необязательная строка
 */

public class DeleteNumsFromPaper implements IDeleteNumFromArray{
        public int deleteNumFromArray(int[] arr, int x){

            int algoLvl = 0;
            int size = arr.length;
            int n = arr.length;

            for (int i = 0; i < size;){
                algoLvl++;
                if (arr[i] == x) {
                    for (int j = i; j < size-1; j++){
                        algoLvl++;
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                    size--;
                }
                else{
                    i++;
                }
            }
            System.out.println("res.length = " + size + ", mas.length = " + n + ", algo_lvl = " + algoLvl);
            return size;
        }
}
