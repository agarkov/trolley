-- --------------------------------------------------------
-- Хост:                         localhost
-- Версия сервера:               5.5.23 - MySQL Community Server (GPL)
-- ОС Сервера:                   Win32
-- HeidiSQL Версия:              8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Дамп структуры базы данных trolley
DROP DATABASE IF EXISTS `trolley`;
CREATE DATABASE IF NOT EXISTS `trolley` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `trolley`;


-- Дамп структуры для таблица trolley.bus
CREATE TABLE IF NOT EXISTS `bus` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `modelId` int(10) unsigned NOT NULL COMMENT 'ID модели',
  `serial` int(10) unsigned NOT NULL COMMENT 'Заводской №',
  `serialAlt` varchar(50) DEFAULT NULL COMMENT 'Полный заводской №',
  `manM` int(10) unsigned DEFAULT NULL COMMENT 'Месяц изготовления',
  `manY` year(4) DEFAULT NULL COMMENT 'Год изготовления',
  `overM` int(10) unsigned DEFAULT NULL COMMENT 'Месяц списания',
  `overY` year(4) DEFAULT NULL COMMENT 'Год списания',
  PRIMARY KEY (`id`),
  KEY `FK_bus_catmodel` (`modelId`),
  CONSTRAINT `FK_bus_catmodel` FOREIGN KEY (`modelId`) REFERENCES `catmodel` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='Список подвижного состава';

-- Дамп данных таблицы trolley.bus: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `bus` DISABLE KEYS */;
/*!40000 ALTER TABLE `bus` ENABLE KEYS */;


-- Дамп структуры для таблица trolley.buschange
CREATE TABLE IF NOT EXISTS `buschange` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `busId` int(10) unsigned NOT NULL COMMENT 'ID троллейбуса',
  `eventId` int(10) unsigned NOT NULL COMMENT 'ID события',
  `bortId` int(10) unsigned NOT NULL COMMENT 'ID бортового №',
  `depoId` int(10) unsigned NOT NULL COMMENT 'ID депо стоянки',
  `depoMain` int(10) unsigned NOT NULL COMMENT 'ID депо приписки',
  `typeId` int(10) unsigned NOT NULL COMMENT 'ID типа троллейбуса',
  `statusId` int(10) unsigned NOT NULL COMMENT 'ID статуса',
  PRIMARY KEY (`id`),
  KEY `FK_buschange_catdepo_2` (`depoMain`),
  KEY `FK_buschange_catbustype` (`typeId`),
  KEY `FK_buschange_event` (`eventId`),
  KEY `FK_buschange_bus` (`busId`),
  KEY `FK_buschange_catbort` (`bortId`),
  KEY `FK_buschange_catdepo` (`depoId`),
  KEY `FK_buschange_catstatus` (`statusId`),
  CONSTRAINT `FK_buschange_bus` FOREIGN KEY (`busId`) REFERENCES `bus` (`id`),
  CONSTRAINT `FK_buschange_catbort` FOREIGN KEY (`bortId`) REFERENCES `catbort` (`id`),
  CONSTRAINT `FK_buschange_catbustype` FOREIGN KEY (`typeId`) REFERENCES `catbustype` (`id`),
  CONSTRAINT `FK_buschange_catdepo` FOREIGN KEY (`depoId`) REFERENCES `catdepo` (`id`),
  CONSTRAINT `FK_buschange_catdepo_2` FOREIGN KEY (`depoMain`) REFERENCES `catdepo` (`id`),
  CONSTRAINT `FK_buschange_catstatus` FOREIGN KEY (`statusId`) REFERENCES `catstatus` (`id`),
  CONSTRAINT `FK_buschange_event` FOREIGN KEY (`eventId`) REFERENCES `event` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='История изменений - троллейбусы';

-- Дамп данных таблицы trolley.buschange: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `buschange` DISABLE KEYS */;
/*!40000 ALTER TABLE `buschange` ENABLE KEYS */;


-- Дамп структуры для таблица trolley.catbort
CREATE TABLE IF NOT EXISTS `catbort` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `text` varchar(50) NOT NULL COMMENT 'Бортовой №',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='Список бортовых №';

-- Дамп данных таблицы trolley.catbort: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `catbort` DISABLE KEYS */;
/*!40000 ALTER TABLE `catbort` ENABLE KEYS */;


-- Дамп структуры для таблица trolley.catbustype
CREATE TABLE IF NOT EXISTS `catbustype` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `text` varchar(50) DEFAULT NULL COMMENT 'Тип троллейбуса',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='Типы троллейбусов';

-- Дамп данных таблицы trolley.catbustype: ~3 rows (приблизительно)
/*!40000 ALTER TABLE `catbustype` DISABLE KEYS */;
INSERT INTO `catbustype` (`id`, `text`) VALUES
	(1, 'Троллейбус пассажирский'),
	(2, 'Троллейбус-техпомощь'),
	(3, 'Троллейбус грузовой');
/*!40000 ALTER TABLE `catbustype` ENABLE KEYS */;


-- Дамп структуры для таблица trolley.catdepo
CREATE TABLE IF NOT EXISTS `catdepo` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `text` varchar(50) NOT NULL COMMENT 'Депо кратко',
  `textAlt` varchar(50) NOT NULL COMMENT 'Доп. информация',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='Список депо';

-- Дамп данных таблицы trolley.catdepo: ~4 rows (приблизительно)
/*!40000 ALTER TABLE `catdepo` DISABLE KEYS */;
INSERT INTO `catdepo` (`id`, `text`, `textAlt`) VALUES
	(1, 'нет данных', ''),
	(2, '№1 (МРМ)', 'ул. Льва Толстого, 51'),
	(3, '№1 (Камышовая)', 'Камышовое шоссе'),
	(4, '№2', 'ул. Горпищенко, 77');
/*!40000 ALTER TABLE `catdepo` ENABLE KEYS */;


-- Дамп структуры для таблица trolley.catevent
CREATE TABLE IF NOT EXISTS `catevent` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `text` varchar(50) NOT NULL COMMENT 'Тип события',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='Типы событий';

-- Дамп данных таблицы trolley.catevent: ~12 rows (приблизительно)
/*!40000 ALTER TABLE `catevent` DISABLE KEYS */;
INSERT INTO `catevent` (`id`, `text`) VALUES
	(1, 'нет данных'),
	(2, 'ДТП'),
	(3, 'Возгорание'),
	(4, 'Передача в пределах города'),
	(5, 'Передача между городами'),
	(6, 'Смена окраски'),
	(7, 'Смена бортового номера'),
	(8, 'Проведение ремонта'),
	(9, 'Принятие нового троллейбуса'),
	(10, 'Принятие б/у троллейбуса'),
	(11, 'Нанесение рекламы'),
	(12, 'Назначение бортового номера');
/*!40000 ALTER TABLE `catevent` ENABLE KEYS */;


-- Дамп структуры для таблица trolley.catmaker
CREATE TABLE IF NOT EXISTS `catmaker` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `text` varchar(50) NOT NULL COMMENT 'Изготовитель кратко',
  `textAlt` varchar(50) DEFAULT NULL COMMENT 'Изготовитель полно',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='Список изготовителей';

-- Дамп данных таблицы trolley.catmaker: ~4 rows (приблизительно)
/*!40000 ALTER TABLE `catmaker` DISABLE KEYS */;
INSERT INTO `catmaker` (`id`, `text`, `textAlt`) VALUES
	(1, 'нет данных', 'нет данных'),
	(2, 'ЗИУ', 'Завод имени Урицкого, г. Энгельс (Саратов)'),
	(3, 'Skoda', 'Шкода'),
	(4, 'ЮМЗ', 'Южный машиностроительный завод, Украина');
/*!40000 ALTER TABLE `catmaker` ENABLE KEYS */;


-- Дамп структуры для таблица trolley.catmodel
CREATE TABLE IF NOT EXISTS `catmodel` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `makerId` int(10) unsigned NOT NULL COMMENT 'ID изготовителя',
  `text` varchar(50) NOT NULL COMMENT 'Модель',
  `textAlt` varchar(50) DEFAULT NULL COMMENT 'Вариант модели',
  PRIMARY KEY (`id`),
  KEY `FK_catmodel_catmaker` (`makerId`),
  CONSTRAINT `FK_catmodel_catmaker` FOREIGN KEY (`makerId`) REFERENCES `catmaker` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='Список моделей';

-- Дамп данных таблицы trolley.catmodel: ~3 rows (приблизительно)
/*!40000 ALTER TABLE `catmodel` DISABLE KEYS */;
INSERT INTO `catmodel` (`id`, `makerId`, `text`, `textAlt`) VALUES
	(1, 1, 'нет данных', NULL),
	(2, 2, 'ЗИУ-5', NULL),
	(3, 2, 'ЗИУ-9', NULL);
/*!40000 ALTER TABLE `catmodel` ENABLE KEYS */;


-- Дамп структуры для таблица trolley.catobject
CREATE TABLE IF NOT EXISTS `catobject` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `text` varchar(50) NOT NULL COMMENT 'Имя таблицы',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='Ссылки на таблицы объектов';

-- Дамп данных таблицы trolley.catobject: ~4 rows (приблизительно)
/*!40000 ALTER TABLE `catobject` DISABLE KEYS */;
INSERT INTO `catobject` (`id`, `text`) VALUES
	(1, 'нет данных'),
	(2, 'Троллейбус'),
	(5, 'Территория депо'),
	(6, 'Местность');
/*!40000 ALTER TABLE `catobject` ENABLE KEYS */;


-- Дамп структуры для таблица trolley.catstatus
CREATE TABLE IF NOT EXISTS `catstatus` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `text` varchar(50) NOT NULL COMMENT 'Текущее состояние',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='Текущее состояние';

-- Дамп данных таблицы trolley.catstatus: ~9 rows (приблизительно)
/*!40000 ALTER TABLE `catstatus` DISABLE KEYS */;
INSERT INTO `catstatus` (`id`, `text`) VALUES
	(1, 'нет данных'),
	(2, 'Прислан новым'),
	(3, 'Прислан б/у'),
	(4, 'Рабочий'),
	(5, 'В ремонте'),
	(6, 'Нерабочий'),
	(7, 'Вероятно списание'),
	(8, 'Списан'),
	(9, 'Выбыл из города');
/*!40000 ALTER TABLE `catstatus` ENABLE KEYS */;


-- Дамп структуры для таблица trolley.catvaccess
CREATE TABLE IF NOT EXISTS `catvaccess` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `text` varchar(50) NOT NULL COMMENT 'Уровень доступа',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='Доступ к изображениям';

-- Дамп данных таблицы trolley.catvaccess: ~4 rows (приблизительно)
/*!40000 ALTER TABLE `catvaccess` DISABLE KEYS */;
INSERT INTO `catvaccess` (`id`, `text`) VALUES
	(1, 'Недоступна для просмотра'),
	(2, 'Доступна избранным'),
	(3, 'Доступна владельцу'),
	(4, 'Доступна всем');
/*!40000 ALTER TABLE `catvaccess` ENABLE KEYS */;


-- Дамп структуры для таблица trolley.catvowner
CREATE TABLE IF NOT EXISTS `catvowner` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `text` varchar(50) NOT NULL COMMENT 'Владелец',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='Владельцы изображений';

-- Дамп данных таблицы trolley.catvowner: ~3 rows (приблизительно)
/*!40000 ALTER TABLE `catvowner` DISABLE KEYS */;
INSERT INTO `catvowner` (`id`, `text`) VALUES
	(1, 'нет данных'),
	(2, 'Sadman'),
	(3, 'Palmer');
/*!40000 ALTER TABLE `catvowner` ENABLE KEYS */;


-- Дамп структуры для таблица trolley.catvtype
CREATE TABLE IF NOT EXISTS `catvtype` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `text` varchar(50) NOT NULL COMMENT 'Тип изображения',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='Типы изображений';

-- Дамп данных таблицы trolley.catvtype: ~5 rows (приблизительно)
/*!40000 ALTER TABLE `catvtype` DISABLE KEYS */;
INSERT INTO `catvtype` (`id`, `text`) VALUES
	(1, 'нет данных'),
	(2, 'фотография'),
	(3, 'схема окраски'),
	(4, 'рисунок'),
	(5, 'модель');
/*!40000 ALTER TABLE `catvtype` ENABLE KEYS */;


-- Дамп структуры для таблица trolley.event
CREATE TABLE IF NOT EXISTS `event` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `typeId` int(10) unsigned NOT NULL COMMENT 'ID типа события',
  `day` int(10) unsigned DEFAULT NULL COMMENT 'День события',
  `month` int(10) unsigned DEFAULT NULL COMMENT 'Месяц события',
  `year` year(4) DEFAULT NULL COMMENT 'Год события',
  `text` text NOT NULL COMMENT 'Описание события',
  PRIMARY KEY (`id`),
  KEY `FK_event_catevent` (`typeId`),
  CONSTRAINT `FK_event_catevent` FOREIGN KEY (`typeId`) REFERENCES `catevent` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='Список событий';

-- Дамп данных таблицы trolley.event: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `event` DISABLE KEYS */;
/*!40000 ALTER TABLE `event` ENABLE KEYS */;


-- Дамп структуры для таблица trolley.eventobject
CREATE TABLE IF NOT EXISTS `eventobject` (
  `eventId` int(10) unsigned NOT NULL COMMENT 'ID события',
  `objType` int(10) unsigned NOT NULL COMMENT 'Тип объекта',
  `objId` int(10) unsigned NOT NULL COMMENT 'ID объекта',
  UNIQUE KEY `uniq` (`eventId`,`objType`,`objId`),
  KEY `FK_eventobject_catobject` (`objType`),
  CONSTRAINT `FK_eventobject_catobject` FOREIGN KEY (`objType`) REFERENCES `catobject` (`id`),
  CONSTRAINT `FK_eventobject_event` FOREIGN KEY (`eventId`) REFERENCES `event` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='Привязка событий к объектам';

-- Дамп данных таблицы trolley.eventobject: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `eventobject` DISABLE KEYS */;
/*!40000 ALTER TABLE `eventobject` ENABLE KEYS */;


-- Дамп структуры для таблица trolley.view
CREATE TABLE IF NOT EXISTS `view` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'ID типа изображения',
  `owner` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'ID владельца',
  `access` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'ID уровня доступа',
  `path` varchar(50) NOT NULL COMMENT 'Линк на файл',
  `color` varchar(50) NOT NULL COMMENT 'Используемые цвета',
  `text` text NOT NULL COMMENT 'Комментарий',
  `day` int(10) unsigned DEFAULT NULL COMMENT 'День события',
  `month` int(10) unsigned DEFAULT NULL COMMENT 'Месяц события',
  `year` year(4) DEFAULT NULL COMMENT 'Год события',
  PRIMARY KEY (`id`),
  KEY `FK_view_catvaccess` (`access`),
  KEY `FK_view_catvowner` (`owner`),
  KEY `FK_view_catvtype` (`type`),
  CONSTRAINT `FK_view_catvaccess` FOREIGN KEY (`access`) REFERENCES `catvaccess` (`id`),
  CONSTRAINT `FK_view_catvowner` FOREIGN KEY (`owner`) REFERENCES `catvowner` (`id`),
  CONSTRAINT `FK_view_catvtype` FOREIGN KEY (`type`) REFERENCES `catvtype` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='База изображений';

-- Дамп данных таблицы trolley.view: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `view` DISABLE KEYS */;
/*!40000 ALTER TABLE `view` ENABLE KEYS */;


-- Дамп структуры для таблица trolley.viewobject
CREATE TABLE IF NOT EXISTS `viewobject` (
  `viewId` int(10) unsigned NOT NULL COMMENT 'ID изображения',
  `objType` int(10) unsigned NOT NULL COMMENT 'Тип объекта',
  `objId` int(10) unsigned NOT NULL COMMENT 'ID объекта',
  `pos` decimal(4,2) unsigned NOT NULL COMMENT 'Позиция подсказки',
  UNIQUE KEY `uniq` (`viewId`,`objType`,`objId`),
  KEY `FK_viewobject_catobject` (`objType`),
  CONSTRAINT `FK_viewobject_catobject` FOREIGN KEY (`objType`) REFERENCES `catobject` (`id`),
  CONSTRAINT `FK_viewobject_view` FOREIGN KEY (`viewId`) REFERENCES `view` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Привязка фото к объектам';

-- Дамп данных таблицы trolley.viewobject: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `viewobject` DISABLE KEYS */;
/*!40000 ALTER TABLE `viewobject` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
