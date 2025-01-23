package dev.wakandaacademy.produdoro.pomodo.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "ConfiguracaoPadraoPromodoro")
@Getter
public class ConfiguracaoPadao {
	private static final String CODIGO_DEFAUT = "DEFALT";
	@Builder.Default
	@MongoId(targetType = FieldType.STRING)
	private String codigo = CODIGO_DEFAUT;
	private Integer tempoMinutosFoco;
	private Integer tempoMinutosPausaCurta;
	private Integer tempoMinutosPausaLonga;
	private Integer repeticoesParaPausaLonga;

}
