from typing import Optional

# pega cada valor I e soma com cada valor J verificando todas as possibilidades de soma de 2 numeros no array (lista)
def two_sum(nums: list[int], target: int) -> Optional[list[int]]:
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                return [i, j]

if __name__ == '__main__':
    #Exemplo1
    n1 = [2, 7, 11, 15]
    t1 = 9
    resultado1 = two_sum(n1, t1)
    print(f'Resultado: {two_sum(n1, t1)}')

    # Exemplo 2
    n2 = [3, 2, 4]
    t2 = 6
    resultado2 = two_sum(n2, t2)
    print(f'Resultado: {two_sum(n2, t2)}')

    # Exemplo 3
    n3 = [3, 3]
    t3 = 6
    print(f'Resultado: {two_sum(n3, t3)}')


