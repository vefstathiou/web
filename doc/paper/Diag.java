/**
 *
 * @opt attributes
 * @opt types
 * @hidden
 */
class UMLOptions {}

/**
 * @composed - - - Group
 * @has - - - Member
 * @has - - - Publication
 * @has - - - Project
 */
class ResearchCenter {}

/**
 * @has - - - Member
 * @has - - - Publication
 * @has - - - Project
 */
class Group {
	String name;
	String description;
}

/**
 * @has - - - Publication
 */
class Member {
	String name;
	String CV;
}

/**
 * @has - - - Publication
 */
class Project {
	String name;
	String description;
	Integer budget;
}

class Publication {
	String author;
	String title;
	Integer year;
}
