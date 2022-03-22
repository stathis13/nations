package com.qualco.nation.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.qualco.nation.model.Continent;
import com.qualco.nation.model.Country;
import com.qualco.nation.model.CountryLanguage;
import com.qualco.nation.model.CountryStat;
import com.qualco.nation.model.Language;
import com.qualco.nation.model.Region;
import com.qualco.nation.model.RegionArea;
import com.qualco.nation.service.model.ContinentDTO;
import com.qualco.nation.service.model.CountryDTO;
import com.qualco.nation.service.model.CountryLanguageDTO;
import com.qualco.nation.service.model.CountryStatDTO;
import com.qualco.nation.service.model.LanguageDTO;
import com.qualco.nation.service.model.RegionAreaDTO;
import com.qualco.nation.service.model.RegionDTO;

@Mapper(componentModel = "spring")
public interface NationMapper {

	NationMapper INSTANCE = Mappers.getMapper(NationMapper.class);

	ContinentDTO toContinentDTO(Continent in);
	CountryDTO toCountryDTO(Country in);
	LanguageDTO toLanguageDTO(Language in);
	RegionDTO toRegionDTO(Region in);

	List<ContinentDTO> toContinentsDTO(List<Continent> in);
	List<CountryDTO> toCountriesDTO(List<Country> in);
	List<LanguageDTO> toLanguagesDTO(List<Language> in);
	List<RegionDTO> toRegionsDTO(List<Region> in);
	List<RegionAreaDTO> toRegionAreasDTO(List<RegionArea> in);
	List<CountryLanguageDTO> toCountryLanguagesDTO (List<CountryLanguage> in);
	List<CountryStatDTO> toCountryStatsDTO(List<CountryStat> in);

}
