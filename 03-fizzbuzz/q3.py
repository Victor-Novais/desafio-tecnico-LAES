
def fizzbuzz(num: int) -> list[str]:
    result = []
    #itera sobre valores possiveis do numero
    for i in range(1, num + 1):
        output = ""

        #condicoes pra geracao do nome
        if i % 3 == 0:
            output += "Fizz"
        if i % 5 == 0:
            output += "Buzz"

        #se nao caiu na condicao, pega o proprio valor da posicao
        if not output:
            output = str(i)

        result.append(output)

    return result

if __name__ == '__main__':
    #ex1
    print(fizzbuzz(3))
    #ex2
    print(fizzbuzz(5))
    #ex3
    print(fizzbuzz(15))


