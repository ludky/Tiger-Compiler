parser grammar Tiger;

options {

}

tokens {

}

@header {

}

@rulecatch {

}

@members {

}



tiger_program
    :   type_declaration_list funct_declaration_list main_function
    ;

funct_declaration_list
    :   funct_declaration
    |   funct_declaration_list
    |
    ;

funct_declaration
    :   ret_type Identifier 
    |






