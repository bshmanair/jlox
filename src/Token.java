// package com.craftinginterpreters.lox;

class Token
{
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;

    Token(TokenType type, String lexeme, Object literal, int line)
    {
        this.type = type;
        this.lexeme = lexeme; // text
        this.literal = literal;
        this.line = line;
    }

    @Override // Original toString() parses values to string.
    public String toString()
    {
        return type + " " + lexeme + " " + literal;
    }
}