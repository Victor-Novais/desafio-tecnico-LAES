

def climbStairs(n: int) -> int:
    # se for 1 ou 2 o número de possibilidades será igual ao próprio valor, entao ja dou um bypass
    if n == 1 or n == 2:
        return n

    prev2 = 1  # Representa o número de formas para n = 1
    prev1 = 2  # Representa o número de formas para n = 2

    # Loop para calcular a partir de n = 3 (porque ja eliminamos a possibilidade de 1 ou 2)  até o valor de n
    for i in range(3, n + 1):
        # O número de maneiras de alcançar o degrau i é a soma dos dois anteriores
        current = prev1 + prev2 #current é a quantidade possivel de alcançar o degrau i
        # Atualiza os valores para o próximo ciclo
        prev2 = prev1
        prev1 = current

    return prev1

if __name__ == '__main__':
    #exemplo 1
    print(climbStairs(2))

    print(climbStairs(3))
