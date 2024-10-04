 INSERT INTO `tipos_documento` (`id`, `nombre_tipo_documento`) VALUES (NULL, 'DNI'), (NULL, 'PASAPORTE');
INSERT INTO `roles` (`id`, `nombre`) VALUES (NULL, 'ROLE_EMPLEADO'), (NULL, 'ROLE_ADMINISTRADOR'), (NULL, 'ROLE_COCINERO'), (NULL, 'ROLE_AYUDANTECOCINA'), (NULL, 'ROLE_BARMAN'), (NULL, 'ROLE_AYUDANTEBARMAN'), (NULL, 'ROLE_CAJERO'), (NULL, 'ROLE_MOZO'), (NULL, 'ROLE_CORREDOR'), (NULL, 'ROLE_SUPERADMIN');
INSERT INTO `tipos_pedido` (`id`, `nombre`) VALUES (NULL, 'EN MESA'), (NULL, 'PARA LLEVAR');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '1', '0', '1', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '2', '0', '1', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '3', '0', '1', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '4', '0', '1', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '5', '0', '1', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '6', '0', '1', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '7', '0', '1', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '8', '0', '1', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '9', '0', '1', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '10', '0', '1', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '15', '0', '2', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '11', '0', '2', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '12', '0', '2', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '13', '0', '2', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '14', '0', '2', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '16', '5', '2', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '17', '0', '2', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '18', '0', '2', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '19', '5', '2', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '20', '0', '2', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '21', '0', '2', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '22', '5', '2', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '23', '0', '2', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '24', '0', '2', NULL, 'LIBRE');
INSERT INTO `mesas` (`id`, `nmesa`, `npersonas`, `piso`, `detalles`, `estado`) VALUES (NULL, '25', '0', '2', NULL, 'LIBRE');

 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Lima',  '150101');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Barranco',  '150104');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Breña',  '150105');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Chorrillos',  '150108');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'El Agustino',  '150111');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Independencia',  '150112');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Jesús María',  '150113');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'La Victoria',  '150115');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Lince',  '150116');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Los Olivos',  '150117');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Magdalena del Mar',  '150120');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Pueblo Libre',  '150121');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Miraflores',  '150122');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Rímac',  '150128');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'San Borja',  '150130');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'San Isidro',  '150131');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'San Luis',  '150134');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'San Martín de Porres',  '150135');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'San Miguel',  '150136');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Santa Anita',  '150137');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Santiago de Surco',  '150140');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Surquillo',  '150141');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Ancón',  '150102');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Carabayllo',  '150106');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Chaclacayo',  '150107');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Cieneguilla',  '150109');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'LURIGANCHO-CHOSICA',  '150118');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Lurin',  '150119');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Pachacamac',  '150123');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Pucusana',  '150124');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Puente Piedra',  '150125');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Punta Hermosa',  '150126');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Punta Negra',  '150127');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'San Bartolo',  '150129');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Santa María del Mar',  '150138');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Santa Rosa',  '150139');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Ate',  '150103');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Comas',  '150110');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'La Molina',  '150114');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'San Juan de Lurigancho',  '150132');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'San Juan de Miraflores',  '150133');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Villa El Salvador',  '150142');
 INSERT INTO `distritos`  (`id_distrito`, `nombre_distrito`, `ubigeo`) VALUES (NULL, 'Villa María del Triunfo',  '150143');

 INSERT INTO `cargos` (`id`, `nombre_cargo`) VALUES (NULL, 'MOZO'), (NULL, 'COCINERO'), (NULL, 'ADMINISTRADOR'), (NULL, 'BARMAN'), (NULL, 'AYUDANTE DE COCINA'), (NULL, 'CAJERO'), (NULL, 'RECEPCIONISTA');



 INSERT INTO `empleados` (`fecha_nac`, `id`, `id_cargo`, `id_distrito`, `id_tipo_documento`, `celular`, `num_doc`, `apellidos`, `desc_empleado`, `direccion`, `email`, `estado_civil`, `fecha_registro`, `foto`, `genero`, `nombres`, `estado`) VALUES ('2000-09-03', NULL, '3', '37', '1', '970125650', '72812569', 'IZAGUIRRE COLACHAGUA', 'EMPLEADO EN FASE DE PRUEBA', 'AV. LAS TORRES DE SANTA CLARA, SECCION 12, BLOCK 15, DEP 201', 'ricardoiza@outlook.com', 'S', '2024-09-03', NULL, 'M', 'RICARDO RAÚL', 'ACTIVO');

 INSERT INTO `categoria_plato` (`id`, `nombre_categoria`) VALUES (NULL, 'ENTRADAS'), (NULL, 'CEVICHES'), (NULL, 'FETUCCINIS'), (NULL, 'DUOS DE ARROCES'), (NULL, 'TRIOS'), (NULL, 'TIRADITOS'), (NULL, 'ARROCES'), (NULL, 'TACU TACU'), (NULL, 'SOPAS'), (NULL, 'DUOS DE CHICHARRONES'), (NULL, 'PICANTES'), (NULL, 'PESCADOS ENTEROS'), (NULL, 'PARRILLAS'), (NULL, 'FUENTES');


 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '1', '42.90',  NULL, 'FESTIVAL DE CAUSAS'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '1', '27.90',  NULL, 'CONCHITAS PARMESANAS'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '1', '28.90',  NULL, 'LECHE DE MONJA'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '1', '35.90',  NULL, 'CAUSA ESCABECHADA'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '1', '36.90',  NULL, 'LECHE DE TIGRE'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '1', '28.90',  NULL, 'LECHE PANTERA'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '2', '35.90',  NULL, 'CEVICHE DE PESCADO DEL DÍA'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '2', '43.90',  NULL, 'CEVICHE CONGA'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '2', '45.90',  NULL, 'CEVICHE DE CONCHAS NEGRAS'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '2', '45.90',  NULL, 'CEVICHE ASESINO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '2', '39.90',  NULL, 'CEVICHE MIXTO ESPECIAL'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '2', '42.90',  NULL, 'CEVICHE CLASICO PESCADO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '3', '43.90',    NULL, 'FETUCCINI A LA HUANCAINA CON LAGOSTINO A LA PARILLA'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '3', '45.90',    NULL, 'FETUCINNI A LA HUANCAINA LOMO SALTADO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '3', '39.90',    NULL, 'FETUCINNI A LA HUANCAINA CON SALTADO DE PESCADO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '3', '36.90',    NULL, 'FETUCCINI AL PESTO CON FILETE DE POLLO A LA PLANCHA'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '3', '36.90',    NULL, 'FETUCCINI A LA HUANCAINA SALTADO DE POLLO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '3', '42.90',    NULL, 'FETUCCINNI AL PESTO CON UNA SABANA DE LOMO FINO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '4', '42.90',    NULL, 'DUO 1 ARROCES (ARROZ CON MARISCOS + CEVICHE PESCADO)'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '4', '39.90',    NULL, 'DUO 2 ARROCES ARROZ CHICLAYANA + CEVICHE DE PESCADO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '4', '41.90',    NULL, 'DUO 3 ARROZ CHAUFA MARISCOS + CEVICHE PESCADO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '4', '41.90',    NULL, 'DUO 4 ARROZ NORTEÑO + CEVICHE PESCADO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '4', '41.90',    NULL, 'DUI 5 ARROZ CHAUFA + CEVICHE PESCADO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '5', '49.90',    NULL, 'CEVICHE MIXTO + ARROZ MARISCOS + CEVICHE PESCADO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '5', '48.90',    NULL, 'chicharrón pescado + chaufa pescado + ceviche pescado'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '5', '47.90',    NULL, 'chicharrón mariscos + arroz chiclayana + ceviche pescado'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '5', '45.90',    NULL, 'chicharrón pescado + arroz chiclayana + ceviche pescado'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '5', '50.90',    NULL, 'chicharrón pescado + chaufa mariscos+ ceviche pescado'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '5', '47.90',    NULL, 'chicharrón mariscos + arroz norteño+ ceviche pescado'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '6', '42.90',    NULL, 'TIRADITO DE PESCADO REY PELE'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '6', '34.90',    NULL, 'Tiradito de pescado en crema de ají amarillo'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '6', '36.90',    NULL, 'Tiradito pescado en crema olivo'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '6', '34.90',    NULL, 'Tiradito pescado en crema rocoto'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '6', '38.90',    NULL, 'Tiradito pescado en tres sabores'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '6', '42.90',    NULL, 'Tiradito de pulpo en crema de olivo'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '7', '45.90',    NULL, 'ARROZ CHAUFA CONGA'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '7', '42.90',    NULL, 'ARROZ CON MARISCOS Y CONCHAS NEGRAS'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '7', '34.90',    NULL, 'ARROZ CHAUFA DE PESCADO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '7', '34.90',    NULL, 'ARROZ CON MARISCOS'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '7', '42.90',    NULL, 'ARROZ CHAUFA ESPECIAL'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '7', '37.90',    NULL, 'ARROZ CHAUFA MIXTO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '7', '37.90',    NULL, 'ARROZ CON MARISCOS A LA CHICLAYANA'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '8', '45.90',    NULL, 'TACU TACU RELLENO DE MARISCOS'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '8', '40.90',    NULL, 'TACU TACU CON APANADO DE PESCADO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '8', '43.90',    NULL, 'TACU TACU CON FILETE A LA CHORRILLANA'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '8', '48.90',    NULL, 'TACU TACU AJI DE LANGOSTINO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '8', '44.90',    NULL, 'TACU TACU ESPECIAL'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '8', '40.90',    NULL, 'TACU TACU CON PICANTE DE MARISCO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '9', '34.90',    NULL, 'AGUADITO DE PESCADO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '9', '41.90',    NULL, 'CHUPE DE LANGOSTINOS'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '9', '58.90',    NULL, 'SUDADITO TRAMBOYO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '9', '45.90',    NULL, 'PARIHUELA TRAMBOYO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '9', '43.90',    NULL, 'CHUPE DE CAMARONES'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '9', '45.90',    NULL, 'SUDADO CABRILLA'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '10', '36.90',    NULL, 'FILETE ORIENTAL'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '10', '45.90',    NULL, 'CHICHARRON CALAMAR + CEVICHE PESCADO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '10', '45.90',    NULL, 'CHICHARRON MIXTO + CEVICHE PESCADO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '10', '42.90',    NULL, 'CHICHARRON PESCADO + CEVICHE PESCADO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '10', '35.90',    NULL, 'CHICHARRON PULPO + CEVICHE PESCADO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '10', '38.90',    NULL, 'CHICHARRON MIXTO + CEVICHE MIXTO ESPECIAL'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '11', '38.90',    NULL, 'PICANTE DE MARISCO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '11', '43.90',    NULL, 'AJI DE MARISCOS'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '11', '41.90',    NULL, 'PICANTE DE LANGOSTINO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '11', '42.90',    NULL, 'PICANTE DE MARISCO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '12', '35.90',    NULL, 'TRUCHA FRITA'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '12', '55.90',    NULL, 'CHITA FRITA'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '12', '45.90',    NULL, 'CABRILLA FRITA'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '13', '49.90',    NULL, 'PARRILLA MIXTA MARINA'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '13', '33.90',    NULL, 'TRUCHA A LA PARRILLA'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '13', '40.90',    NULL, 'FILETE A LA PARRILLA'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '13', '45.90',    NULL, 'PARRILLA CON PULPO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '14', '98.90',    NULL, 'FUENTE DE CEVICHE DE PESCADO'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '14', '115.90',    NULL, 'FUENTE DE CEVICHE MIXTO ESPECIAL'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '14', '115.90',    NULL, 'FUENTE CHICHARRON MIXTO ESPECIAL'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '14', '112.90',    NULL, 'FUENTE DE CEVICHE MIXTO NATURAL'                                        , 'ACTIVO');
 INSERT INTO `platos` (`id`, `id_categoria_plato`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '14', '95.90',    NULL, 'FUENTE DE ARROZ DE MARISCOS'                                        , 'ACTIVO');

 INSERT INTO `tipos_bebida` (`id`, `nombre_bebida`) VALUES (NULL, 'REFRESCOS'), (NULL, 'CAFES'), (NULL, 'INFUSIONES Y TÉS'), (NULL, 'CERVEZAS'), (NULL, 'LICORES'), (NULL, 'BRANDY'), (NULL, 'DIGESTIVO'), (NULL, 'COCTELES');

 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '1','5.50', NULL, 'COCA COLA PERSONAL ZERO 500ml', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '1','5.50', NULL, 'COLA COLA PERSONAL 500ml', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '1','5.50', NULL, 'INKA COLA PERSONAL 500ml', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '1','5.50', NULL, 'INKA COLA PERSONAL SIN AZUCAR 500ml', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '1','3.50', NULL, 'AGUA SAN LUIS 500ml', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '1','6.00', NULL, 'REFRESCO MARACUYA 1/2LT', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '1','12.00', NULL, 'REFRESCO CHICHA MORADA 1 LITRO', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '1','6.00', NULL, 'REFRESCO CHICHA MORADA 1/2 LITRO', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '1','6.00', NULL, 'REFRESCO CHICHA MORADA 1/2 LITRO', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '2','5.00', NULL, 'CAFÉ SOLO', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '2','5.00', NULL, 'CAFÉ CON LECHE', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '2','7.00', NULL, 'CAPUCCINO', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '3','4.50', NULL, 'INFUSIÓN TÉ', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '3','4.50', NULL, 'INFUSIÓN MANZANILLA', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '3','4.50', NULL, 'INFUSIÓN HIERBA LUISA', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '3','4.50', NULL, 'INFUSIÓN BOLDO', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '3','4.50', NULL, 'INFUSIÓN ANIS', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '4','13.00', NULL, 'CEVEZA CRISTAL 650ml', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '4','13.00', NULL, 'CERVEZA PILSEN 650ml', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '4','15.00', NULL, 'CERVEZA CUSQUEÑA TRIGO 650ml', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '4','15.00', NULL, 'CERVEZA CUSQUEÑA NEGRA 650ml', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '5','12.50', NULL, 'CAMPARI', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '5','12.50', NULL, 'SPRITZ APEROL', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '5','6.50', NULL, 'VERMUT ROJO', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '6','20.00', NULL, 'BRANDY LARIOS', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '6','9.00', NULL, 'CARDENAL MENDOZA', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '6','20.00', NULL, 'TORRES 5', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '7','20.00', NULL, 'AGUARDIENTE DE HIERVAS', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '7','20.00', NULL, 'BAILEYS 5', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '7','12.00', NULL, 'DUPONT 12', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '7','5.00', NULL, 'VASO DE ANISADO 200ml', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '8','12.00', NULL, 'MOJITO', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '8','15.00', NULL, 'AMERICANO', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '8','6.00', NULL, 'PISCO SOUR', 'ACTIVO');
 INSERT INTO `bebidas` (`id`, `id_tipo_bebida`, `precio`, `imagen`, `nombre`, `estado`) VALUES (NULL, '8','30.00', NULL, 'PISCO SOUR JARRA 1LT', 'ACTIVO');
 INSERT INTO `clientes` (`id`, `apellidos`, `celular`, `nombres`, `num_doc`) VALUES (NULL, 'GENERIC', '999999999', 'CLIENTE', '99999999');
 INSERT INTO `tipos_recibo` (`id`, `nombre_tipo_recibo`) VALUES (NULL, 'NOTA DE VENTA'), (NULL, 'BOLETA'), (NULL, 'FACTURA');

 INSERT INTO `empleados` (`id`, `apellidos`, `celular`, `desc_empleado`, `direccion`, `email`, `estado`, `estado_civil`, `fecha_nac`, `fecha_registro`, `foto`, `genero`, `nombres`, `num_doc`, `id_cargo`, `id_distrito`, `id_tipo_documento`) VALUES
 (3, 'RIVADENEIRA', '985645123', NULL, 'AV De La Poesia 160 Biblioteca Nacional Urb', 'fernando@outlook.com', 'ACTIVO', 'S', '1998-05-05', NULL, NULL, 'M', 'FERNANDO ', '10203040', 2, 37, 1),
 (4, 'Morocolla Gamarra ', '987654123', NULL, 'JR Camaná 616', 'morocolla@hotmail.com', 'ACTIVO', 'S', '1999-10-05', NULL, NULL, 'M', 'Daniel', '20304050', 4, 20, 1);

 INSERT INTO `usuarios_empleados` (`id_usuario_empleado`, `email`, `password`) VALUES
 (3, 'fernando@outlook.com', '$2a$10$6LCVMvEQw0qhqZhnsDmFbu6.lgyDVnECtzvRp1ubVkeUG3wbK.NlK'),
 (4, 'morocolla@hotmail.com', '$2a$10$WXGdYxBMQZaIvisXDVrX..l7xo7fuj5NW7O.Mi65rWh18zqL3ghJK');


INSERT INTO `usuarios_empleados_roles` (`usuario_empleado_id_usuario_empleado`, `roles_id`) VALUES
(3, 1),
(3, 3),
(3, 4),
(3, 8),
(3, 9),
(4, 1),
(4, 4),
(4, 6),
(4, 8),
(4, 9);
