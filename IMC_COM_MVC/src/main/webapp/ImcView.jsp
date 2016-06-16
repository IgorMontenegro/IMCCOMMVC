<!DOCTYPE html>
<html>
    <head>
        <script src="resources/js/jquery-1.12.3.min.js"></script>
        <link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="resources/css/imc.css">
        <script src="resources/js/bootstrap.min.js"></script>
        <script src="resources/js/jquery-mask-min.js"></script>
        <script src="resources/js/imc.js"></script>
    </head>
    <body>
        <main>
        	<form>
	            <div class="panel panel-primary" id="pnDadosItens">
	                <div class="panel-heading">
	                    IMC
	                </div>
	                    <div class="row">
	                        <div class="col-md-2">
	                          <label>Peso</label>            
	                        </div>
	                        <div class="col-md-10">
	                           <input id="itPeso" name="peso" type="text" placeholder="Digite o peso!" />
	                        </div>
	                    </div>
	                    <div class="row">
	                        <div class="col-md-2">
	                            <label>Altura</label>
	                        </div>
	                        <div class="col-md-10">
	                            <input id="itAltura" name="altura" type="text" placeholder="Digite a altura!" />
	                        </div>
	                    </div>
	                    <div class="row">
	                        <div class="col-md-2">
	                            <label>Sexo</label>
	                        </div>
	                        <div class="col-md-10">
	                            <select id="selectSexo" name="sexo">
	                              <option value="FEMININO">Feminino</option>
	                              <option value="MASCULINO">Masculino</option>
	                            </select>
	                        </div>
	                    </div>
	                <button class="btn btn-primary btnCacular">Calcular</button>
	            </div>
            </form>  
            <div style="margin-left:40%">
  				<b>Resultado: ${resultadoImc}</b>
			</div>
			<div style="margin-left:40%">
  				<b>Situação: ${situacaoImc}</b>
			</div>
        </main>
    </body>
</html>