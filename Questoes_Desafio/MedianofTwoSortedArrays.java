public class MedianofTwoSortedArrays {
// Merge two sorted arrays and find the median
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int m = nums1.length;//variavel que armazena o tamanho do primeiro array
    int n = nums2.length;//variavel que armazena o tamanho do segundo array
    int[] merged = new int[m + n];//array que armazena a fusão dos dois arrays
    int i = 0, j = 0, k = 0;  //índices para percorrer os arrays
// Fusão dos dois arrays
    while (i < m && j < n) {
        if (nums1[i] < nums2[j]) {//compara os elementos dos dois arrays
            merged[k++] = nums1[i++];//adiciona o elemento do primeiro array ao array fundido
        } else {//se o elemento do segundo array for menor ou igual ao do primeiro
            merged[k++] = nums2[j++];//adiciona o elemento do segundo array ao array fundido
        }
    }
// Adiciona os elementos restantes do primeiro array, se houver
    while (i < m) {
        merged[k++] = nums1[i++];//adiciona os elementos restantes do primeiro array ao array fundido
    }
// Adiciona os elementos restantes do segundo array, se houver
    while (j < n) {
        merged[k++] = nums2[j++];//adiciona os elementos restantes do segundo array ao array fundido
    }
// Calcula a mediana
    if ((m + n) % 2 == 0) {
        return (merged[(m + n) / 2 - 1] + merged[(m + n) / 2]) / 2.0;//se a soma dos tamanhos dos arrays for par, a mediana é a média dos dois elementos centrais
    } else {//se a soma dos tamanhos dos arrays for ímpar, a mediana é o elemento central
        return merged[(m + n) / 2];
    }

}
}
