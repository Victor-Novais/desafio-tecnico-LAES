

# usa o método sorted que ordena os numeros
def missing_number_in_array(nums: list[int]) -> int:
    #ordena o array de inteiros
    nums_sorted = sorted(nums)

    #itera sobre cada numero do array, trazendo também o index
    for i, num in enumerate(nums_sorted):
        # Se o I não é igual o NUM, achamos o valor que falta
        if i != num:
            return i

    # Se chegou aqui, todos os números do meio estão corretos
    # O número faltando é o próximo da sequência (o último)
    return len(nums)

if __name__ == '__main__':
    # Exemplo 1
    print(missing_number_in_array([3, 0, 1]))  # 2

    # Exemplo 2
    print(missing_number_in_array([0, 1])) # 2

    # Exemplo 3
    print(missing_number_in_array([9, 6, 4, 2, 3, 5, 7, 0, 1]))  # 8




