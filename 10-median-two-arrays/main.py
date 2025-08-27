def findMedian(nums1, nums2):
    A, B = nums1, nums2
    m, n = len(A), len(B)

    if m > n:
        A, B, m, n = B, A, n, m

    total = m + n
    metade = total // 2

    esquerda, direita = 0, m
    while esquerda <= direita:
        i = (esquerda + direita) // 2  
        j = metade - i                 

        A_esq  = A[i-1] if i > 0 else float("-inf")
        A_dir  = A[i]   if i < m else float("inf")
        B_esq  = B[j-1] if j > 0 else float("-inf")
        B_dir  = B[j]   if j < n else float("inf")

        if A_esq <= B_dir and B_esq <= A_dir:
            if total % 2 == 1: 
                return float(min(A_dir, B_dir))
            maior_esquerda = max(A_esq, B_esq)
            menor_direita  = min(A_dir, B_dir)
            return (maior_esquerda + menor_direita) / 2.0

        if A_esq > B_dir:
            direita = i - 1
        else:
            esquerda = i + 1
    raise ValueError("Entradas inválidas")

print(findMedian([1,3], [2]))  
print(findMedian([1,2], [3,4]))  
