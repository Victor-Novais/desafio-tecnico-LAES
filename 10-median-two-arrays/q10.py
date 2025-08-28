

def findMedianTwoArrays(nums1: list[int], nums2:list[int]) -> list[int]:

    merged = []
    #inicia duas variaveis contadoras com 0
    i = j = 0

    # mesclar os arrays
    while i < len(nums1) and j < len(nums2):
        if nums1[i] <= nums2[j]:
            merged.append(nums1[i])
            i += 1
        else:
            merged.append(nums2[j])
            j += 1

    # adicionar elementos restantes
    while i < len(nums1):
        merged.append(nums1[i])
        i += 1

    while j < len(nums2):
        merged.append(nums2[j])
        j += 1

    # calcular mediana
    n = len(merged)
    if n % 2 == 1:
        return merged[n // 2]
    else:
        return (merged[n // 2 - 1] + merged[n // 2]) / 2

if __name__ == '__main__':
    #ex1
    print(findMedianTwoArrays(nums1=[1,3], nums2=[2]))
    #ex2
    print(findMedianTwoArrays(nums1=[1,2], nums2=[3,4]))