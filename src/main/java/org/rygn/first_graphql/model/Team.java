/**
 * This class represents a Team.
 */
package org.rygn.first_graphql.model;

public class Team {
	private String id;
	private String name;
	private String colors;

	/**
	 * Returns the ID of the team.
	 *
	 * @return the ID of the team
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the ID of the team.
	 *
	 * @param id the ID of the team
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns the name of the team.
	 *
	 * @return the name of the team
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the team.
	 *
	 * @param name the name of the team
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the colors of the team.
	 *
	 * @return the colors of the team
	 */
	public String getColors() {
		return colors;
	}

	/**
	 * Sets the colors of the team.
	 *
	 * @param colors the colors of the team
	 */
	public void setColors(String colors) {
		this.colors = colors;
	}
}
