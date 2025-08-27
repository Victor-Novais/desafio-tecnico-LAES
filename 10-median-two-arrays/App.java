public class App {
    public static void main(String[] args) throws Exception {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(media(nums1, nums2));

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println(media(nums3, nums4));
    }

    public static double media(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return media(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int inicio = 0;
        int fim = m;

        int minimo = Integer.MIN_VALUE;
        int maximo = Integer.MAX_VALUE;

        while (inicio <= fim) {
            int i = (inicio + fim) / 2;
            int j = (m + n + 1) / 2 - i;

            int esquerda1;
            if (i == 0) {
                esquerda1 = minimo;
            } else {
                esquerda1 = nums1[i - 1];
            }

            int direita1;
            if (i == m) {
                direita1 = maximo;
            } else {
                direita1 = nums1[i];
            }

            int esquerda2;
            if (j == 0) {
                esquerda2 = minimo;
            } else {
                esquerda2 = nums2[j - 1];
            }

            int direita2;
            if (j == n) {
                direita2 = maximo;
            } else {
                direita2 = nums2[j];
            }

            if (esquerda1 <= direita2 && esquerda2 <= direita1) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(esquerda1, esquerda2) + Math.min(direita1, direita2)) / 2.0;
                } else {
                    return Math.max(esquerda1, esquerda2);
                }
            } else if (esquerda1 > direita2) {
                fim = i - 1;
            } else {
                inicio = i + 1;
            }
        }

        return -1;
    }
}
