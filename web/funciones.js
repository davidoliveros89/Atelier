/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


function masProductos(x){

    request = new XMLHttpRequest();
    
    //Lee el response de la funcion
    //Manda el request y los parametros
    
    x = x+8;
    
    xmlhttp.open("GET","shop.jsp?x="+x, true);
    xmlhttp.send();
}