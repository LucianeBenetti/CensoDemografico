function validarDadosDoFormulario() {
    var pop1 = document.forms["formDadosDaCidade"]["pop1"].value;
    var area1 = document.forms["formDadosDaCidade"]["area1"].value;
    var dens1 = document.forms["formDadosDaCidade"]["dens1"].value;
    var pib1 = document.forms["formDadosDaCidade"]["pib1"].value;

    var pop2 = document.forms["formDadosDaCidade"]["pop2"].value;
    var area2 = document.forms["formDadosDaCidade"]["area2"].value;
    var dens2 = document.forms["formDadosDaCidade"]["dens2"].value;
    var pib2 = document.forms["formDadosDaCidade"]["pib2"].value;

    var pop1 = document.forms["formDadosDaCidade"]["pop3"].value;
    var area1 = document.forms["formDadosDaCidade"]["area3"].value;
    var dens1 = document.forms["formDadosDaCidade"]["dens3"].value;
    var pib1 = document.forms["formDadosDaCidade"]["pib3"].value;

    var pop2 = document.forms["formDadosDaCidade"]["pop4"].value;
    var area2 = document.forms["formDadosDaCidade"]["area4"].value;
    var dens2 = document.forms["formDadosDaCidade"]["dens4"].value;
    var pib2 = document.forms["formDadosDaCidade"]["pib4"].value;

    if (pop1 == "" || area1 == "" || dens1 == "" || pib1 == "") {
        alert("Um ou mais campos relacionados com as características da cidade estão vazios!");
        return false;
    }

    if (pop2 == "" || area2 == "" || dens2 == "" || pib2 == "") {
        alert("Um ou mais campos relacionados com as características da cidade estão vazios!");
        return false;
    }

    if (pop3 == "" || area3 == "" || dens3 == "" || pib3 == "") {
        alert("Um ou mais campos relacionados com as características da cidade estão vazios!");
        return false;
    }

    if (pop4 == "" || area4 == "" || dens4 == "" || pib4 == "") {
        alert("Um ou mais campos relacionados às características de uma cidade estão vazios!");
        return false;
    }
}
