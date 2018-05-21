public interface IDeleteNumFromArray {
    /**
     * <p> Удаляет все вхождения числа из массива</p>
     *
     * @param arr - массив чисел, например {1, 2, 3, 4};
     * @param x - число, которое нужно удалить из массива <i>arr</i>;
     *
     * @return size - длинна преобразованного массива, размер новой информативной части
     */
    int deleteNumFromArray(int[] arr, int x);
}
