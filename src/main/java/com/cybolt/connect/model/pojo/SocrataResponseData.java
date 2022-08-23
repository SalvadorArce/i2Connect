/*
 * MIT License
 *
 * © N.Harris Computer Corporation (2022)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.cybolt.connect.model.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * A POJO (Plain Old Java Object) for response objects from Socrata. These
 * represent the fields in the NYPD database.
 */
@ToString
public class SocrataResponseData {

	// Complaint
	@JsonProperty("cmplnt_num")
	public String complaintNum;

	@JsonProperty("cmplnt_fr_dt")
	public LocalDate complaintStartDate;

	@JsonProperty("cmplnt_to_dt")
	public LocalDate complaintEndDate;

	@JsonProperty("cmplnt_fr_tm")
	public LocalTime complaintStartTime;

	@JsonProperty("cmplnt_to_tm")
	public LocalTime complaintEndTime;

	@JsonProperty("crm_atpt_cptd_cd")
	public String crimeStatus;

	@JsonProperty("jutisdiction_code")
	public int jurisdictionCode;

	@JsonProperty("juris_desc")
	public String jurisdictionDesc;

	@JsonProperty("ky_cd")
	public int offenceClass;

	@JsonProperty("law_cat_cd")
	public String offenceLevel;

	@JsonProperty("ofns_desc")
	public String offenceDesc;

	@JsonProperty("pd_cd")
	public String internalClassCode;

	@JsonProperty("pd_desc")
	public String classDesc;

	@JsonProperty("rpt_dt")
	public LocalDate dateReported;

	@JsonProperty("loc_of_occur_desc")
	public String occurrenceLocation;

	@JsonProperty("latitude")
	public float latitude;

	@JsonProperty("longitude")
	public float longitude;

	// Location
	@JsonProperty("addr_pct_cd")
	public int precinctCode;

	@JsonProperty("boro_nm")
	public String boroName;

	@JsonProperty("hadevelopt")
	public String houseDev;

	@JsonProperty("parks_nm")
	public String parkName;

	@JsonProperty("patrol_boro")
	public String patrolBoro;

	@JsonProperty("prem_typ_desc")
	public String premisesDesc;

	@JsonProperty("station_name")
	public String stationName;

	@JsonProperty("transit_district")
	public String transitDistrict;

	// Person (Suspect)
	@JsonProperty("susp_age_group")
	public String suspAge;

	@JsonProperty("susp_race")
	public String suspRace;

	@JsonProperty("susp_sex")
	public String suspSex;

	// Person (Victim)
	@JsonProperty("vic_age_group")
	public String vicAge;

	@JsonProperty("vic_race")
	public String vicRace;

	@JsonProperty("vic_sex")
	public String vicSex;
}
