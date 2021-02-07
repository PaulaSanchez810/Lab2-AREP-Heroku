<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculadora media y desviacion estandar</title>
</head>

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<body>

<div class="wrapper">
    <div class="inner">
        <form method="POST" action="/render/">
            <h3>Calculadora Estadística</h3>
            #if($msg)
            <p>$msg</p>
            #else
            <p>Escribe números separados por coma y presiona el
                botón.</p>
            #end

            <label class="form-group">
                <input name="numbers" type="text" class="form-control" required>
                <span>Números</span>
                <span class="border"></span>
            </label>

            <button>Submit
                <i class="zmdi"></i>
            </button>
        </form>
        #if($mean && $deviation)
        <hr style="margin-top: 55px"/>
        <p style="margin: 20px 0">Media: $mean; Desviación Estándar: $deviation</p>
        <hr/>
        #end
    </div>
</div>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>
