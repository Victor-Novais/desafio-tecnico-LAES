def checkerParentesis(s: str) -> bool:

    # tipos de fechamento possiveis armazenados em um dict.
    pair = {')': '(', ']': '[', '}': '{'}

    stack = []

    # pra cada char na string
    for ch in s:
        if ch in pair.values():  # se estiver nos caracteres de abertura
            stack.append(ch)  # coloca na pilha
        elif ch in pair:  # se for no fechamento
            # Verifica se o topo da pilha corresponde ao parêntese de abertura
            if not stack or stack[-1] != pair[ch]:
                return False  #se nao corresponder a string é inválida
            stack.pop()  # Se corresponder, remove o topo da pilha

    # se a pilha estiver vazia no final, significa que todos os parênteses foram fechados da forma correta
    return not stack

if __name__ == '__main__':
    #ex1
    print(checkerParentesis("()"))  # true
    #ex2
    print(checkerParentesis("()[]{}"))  # true
    #ex3
    print(checkerParentesis("(]"))  # false
    #x4
    print(checkerParentesis("([)]"))  #false