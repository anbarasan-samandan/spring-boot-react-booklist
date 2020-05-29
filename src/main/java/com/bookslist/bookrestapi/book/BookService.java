package com.bookslist.bookrestapi.book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class BookService {

	private static List<Book> books = new ArrayList();
	private static int idCounter = 0;

	static {
		books.add(new Book(++idCounter, "pmwwc.jpg", "Microsoft Windows Using C#", "Charles Petzold", "Rs.350", 4,
				"Programming Microsoft Windows with C# is a tutorial for programmers wishing to write applications for Windows using the C# programming language and the Windows Forms class library. C# is a new object-oriented programming language based on C, and Windows Forms is part of the Microsoft .NET framework. Knowledge of the C or C++ programming language is required; some familiarity with object-oriented programming is helpful but not necessary"));
		books.add(new Book(++idCounter, "hfdp.jpg", "Head First Design Patterns", "Charles Petzold", "Rs.450", 4,
				"This edition of Head First Design Patterns—now updated for Java 8—shows you the tried-and-true, road-tested patterns used by developers to create functional, elegant, reusable, and flexible software. By the time you finish this book, you’ll be able to take advantage of the best design practices and experiences of those who have fought the beast of software design and triumphed"));
		books.add(new Book(++idCounter, "wings.jpg", "Wings of Fire: An Autobiography", "A.P.J. Abdul Kalam", "Rs.150",
				5,
				"Avul Pakir Jainulabdeen Abdul Kalam, the son of a little-educated boat-owner in Rameswaram, Tamil Nadu, had an unparalleled career as a defence scientist, culminating in the highest civilian award of India, the Bharat Ratna. As chief of the country's defence research and development programme, Kalam demonstrated the great potential for dynamism and innovation that existed in seemingly moribund research establishments. This is the story of Kalam's rise from obscurity and his personal and professional struggles, as well as the story of Agni, Prithvi, Akash, Trishul and Nag-missiles that have become household names in India and that have raised the nation to the level of a missile power of international reckoning. This is also the saga of independent India's struggle for technological self-sufficiency and defensive autonomy-a story as much about politics, domestic and international, as it is about science."));
		books.add(new Book(++idCounter, "hfjs.jpg", "Head First JavaScript", "Michael Morrison", "Rs.750", 4,
				"This brain-friendly guide teaches you everything from JavaScript language fundamentals to advanced topics, including objects, functions, and the browser’s document object model. You won’t just be reading—you’ll be playing games, solving puzzles, pondering mysteries, and interacting with JavaScript in ways you never imagined. And you’ll write real code, lots of it, so you can start building your own web applications."));
		books.add(new Book(++idCounter, "tkamb.jpg", "To Kill a Mocking Bird", "Harper Lee", "Rs.250", 4,
				"To Kill a Mockingbird is a coming-of-age story, an anti-racist novel, a historical drama of the Great Depression and a sublime example of the Southern writing tradition."));
		books.add(new Book(++idCounter, "snsm.jpg", "Sila Nerangalil Sila Manithargal", "Jayakanthan", "Rs.50", 4,
				"It is based on the novel of same name, by Jayakanthan which was a detailed version of his short story Agni Pravesam.[6] Bhimsingh decided to adapt the novel into a feature film. Jayakanthan wrote the screenplay for the film discarding the traditional commercial elements."));
		books.add(new Book(++idCounter, "wpf.jpg", "Application Code and Markup", "Charles Petzold", "Rs.850", 4,
				"Get the definitive guide to the Windows Presentation Foundation (WPF), the new client programming interface for the Microsoft .NET Framework 3.0 and Windows Vista. Award-winning author Charles Petzold teaches you how to combine C# code and the Extensible Application Markup Language (XAML) to develop applications for the WPF."));
		books.add(new Book(++idCounter, "oru.jpg", "Oru Manithan Oru Veedu Oru Ulagam", "Jayakanthan", "Rs.150", 4,
				"This novel is based on a character who does not know about the city, parents, caste, religion. Who understands the life through his experience."));
		books.add(new Book(++idCounter, "rishi.jpg", "Rishi Moolam", "Jayakanthan", "Rs.250", 3,
				"The eeriness of Jayakanthan's two novellas in this volume is overwhelming and disturbing. The protagonists are helpless victims of psychological maladies. Their suppressed libido and Oedipus complex are areas Tamil writers generally dared not enter - at any rate in the 1960s, when they were written.The brilliant introvert Rajaraman is the quintessential good boy. The play of circumstances kindles oedipal fancies in him. The incandescent consummation with Sarada Mami is a catharsis. A rishi is born looking at the world with a disdain at once benignly distant and compellingly personal.Well-educated and well-employed Janaki lives under the protective cover of her paranoid, possessive, puritanical mother. Her healthy friendship with a collegemate of yesteryear promises liberation. Her short-lived taste of freedom is stamped out and she is sucked back into her mother's bizarre, overwhelming orbit."));
		books.add(new Book(++idCounter, "win.jpg", "The Habbit of Winning", "Prakash Iyer", "Rs.250", 5,
				"Do you feel like throwing in the towel, but want to be a great leader? Would you like to build an organization? Do you want your child to be the best she can be? If you answered yes to any of these questions, The Habit of Winning is the book for you. It is a book that will change the way you think, work and live, with stories about self-belief and perseverance, leadership and teamwork—stories that will ignite a new passion and a renewed sense of purpose in your mind."));
		books.add(new Book(++idCounter, "leader.jpg", "The Secret of Leadership", "Prakash Iyer", "Rs.250", 5,
				"Bestselling author Prakash Iyer uses simple but powerful anecdotes and parables from all over the world to demonstrate what makes for effective personal and professional leadership. Iyer draws lessons from sources as diverse as his driver, a mother giraffe, Abraham Lincoln and footballers in the United Kingdom. He shows how an instinct to lead can be acquired even while flipping burgers at a fast-food chain. All of these stories come together in an explosive cocktail to unleash your inner leader."));
		books.add(new Book(++idCounter, "can.jpg", "YOU TOO CAN", "Prakash Iyer", "Rs.150", 4,
				"You Too Can is filled with stories that celebrate the entrepreneurial spirit. Stories of success, and struggle and survival too. Stories of people starting up, making progress, enjoying the ride and hoping they will make it to the finish line. If there is one, that is. Hopefully, you will find a story that rings a bell, connects, and inspires you. There are business lessons. And several life-lessons too. Success leaves tracks. Whether you are an entrepreneur or an employee, a housewife or a student, here’s your chance to learn from men and women who unleashed the entrepreneur within them. They did it. And now, You Too Can."));
		books.add(new Book(++idCounter, "penny.jpg", "When the Penny Drops", "R Gopalakrishnan", "Rs.350", 4,
				"An invaluable source of inspiration to help leaders understand themselves and overcome their barriers to success For centuries, we have learnt what’s not taught through our own experiences and the stories of others. Even today, only 3 per cent of leadership development occurs due to classroom training. In fact, for most managers, ‘the penny drops’ only when we are at the end of our careers. In this book, R. Gopalakrishnan shares some valuable learnings from his decades of corporate experience, through a series of engaging stories. When the Penny Drops encourages you to reflect on yourself, and will help you learn by identifying the success mantras embedded in you."));
		books.add(new Book(++idCounter, "ceo.jpg", "What the CEO Really Wants from You", "R Gopalakrishnan", "Rs.300",
				4,
				"This brain-friendly guide teaches you everything from JavaScript language fundamentals to advanced topics, including objects, functions, and the browser’s document object model. You won’t just be reading—you’ll be playing games, solving puzzles, pondering mysteries, and interacting with JavaScript in ways you never imagined. And you’ll write real code, lots of it, so you can start building your own web applications."));
		books.add(new Book(++idCounter, "outliers.jpg", "The Outliers", "Malcom Gladwell", "Rs.450", 5,
				"In his #1 bestselling books The Tipping Point, Blink, and Outliers, Malcolm Gladwell has explored the ways we understand and change our world. Now he looks at the complex and surprising ways the weak can defeat the strong, the small can match up against the giant, and how our goals (often culturally determined) can make a huge difference in our ultimate sense of success. Drawing upon examples from the world of business, sports, culture, cutting-edge psychology, and an array of unforgettable characters around the world, David and Goliath is in many ways the most practical and provocative book Malcolm Gladwell has ever written."));
		books.add(new Book(++idCounter, "dag.jpg",
				"David and Goliath: Underdogs, Misfits, and the Art of Battling Giants", "Malcom Gladwell", "Rs.700", 4,
				"This brain-friendly guide teaches you everything from JavaScript language fundamentals to advanced topics, including objects, functions, and the browser’s document object model. You won’t just be reading—you’ll be playing games, solving puzzles, pondering mysteries, and interacting with JavaScript in ways you never imagined. And you’ll write real code, lots of it, so you can start building your own web applications."));
		books.add(new Book(++idCounter, "tip.jpg", "The Tipping Point", "Malcom Gladwell", "Rs.200", 5,
				"The tipping point is that magic moment when an idea, trend, or social behavior crosses a threshold, tips, and spreads like wildfire. Just as a single sick person can start an epidemic of the flu, so too can a small but precisely targeted push cause a fashion trend, the popularity of a new product, or a drop in the crime rate. This widely acclaimed bestseller, in which Malcolm Gladwell explores and brilliantly illuminates the tipping point phenomenon, is already changing the way people throughout the world think about selling products and disseminating ideas."));
		books.add(new Book(++idCounter, "hfj.jpg", "Head First Java", "Kathy Sierra", "Rs.650", 5,
				"Learning  a complex new language is no easy task especially when it is an object-oriented computer programming language like Java. You might think the problem is your brain. It seems to have a mind of its own, a mind that doesn't always want to take in the dry, technical stuff you're forced to study."));
		books.add(new Book(++idCounter, "minds.jpg", "Ignited Minds: Unleashing the Power Within India",
				"A.P.J. Abdul Kalam", "Rs.100", 5,
				"This brain-friendly guide teaches you everything from JavaScript language fundamentals to advanced topics, including objects, functions, and the browser’s document object model. You won’t just be reading—you’ll be playing games, solving puzzles, pondering mysteries, and interacting with JavaScript in ways you never imagined. And you’ll write real code, lots of it, so you can start building your own web applications."));
		books.add(new Book(++idCounter, "sci.jpg",
				"The Scientific Indian : A Twenty-First Century Guide To The World Around Us", "A.P.J. Abdul Kalam",
				"Rs.250", 5,
				"Nuclear capability; self-sufficiency in food production; an array of indigenous satellites and missiles; an unmanned Moon mission—India’s achievements in the scientific domain in recent years have been spectacular. But; according to the country’s best-known scientist A.P.J. Abdul Kalam and his close associate Y.S. Rajan; we’ve only just begun. In a century that many experts predict may belong to India; the realization of the vision of a better future for everyone will require a keen understanding of our needs and this can only be achieved by tailoring our research and innovations to the goal of national development. India to the forefront of the world in the decades to come. The Scientific Indian will speak to every curious and adventurous mind; and especially to tomorrow’s scientists and technologists; encouraging us to dream big; and urging us to work hard to make our dreams come true. In The Scientific Indian; the authors of the path-breaking India 2020: A Vision for the New Millennium return after ten years to the core areas of scientific advancement that are crucial today: space exploration; satellite technology; missile development; earth and ocean resources; the biosphere; food production; energy and water harvesting; health care and communications; to name a few. For each aspect; the authors provide the context of recent progress on the global platform as well as Indian breakthroughs; before outlining a pragmatic vision of technological development that will propel."));
		books.add(new Book(++idCounter, "nation.jpg",
				"Envisioning an Empowered Nation: Technology for Societal Transformation", "A.P.J. Abdul Kalam",
				"Rs.350", 5,
				"India has a rich heritage and a talented workforce, and is emerging as a knowledge society. Yet, over 26% of the population is below the poverty line; illiteracy and large scale unemployment persist.      Over the years, the authors have interacted with people from all walks of life. During these interactions, they could perceive a strong desire of the people to live in a prosperous, peaceful and safe India. Moreover, they realised that technology is the engine which is capable of leading the nation towards growth and prosperity."));
		books.add(new Book(++idCounter, "kalli.jpg", "Kallikaattu Ithigaasam", "Vairamuthu", "Rs.150", 5,
				"Kallikkattu Edhihasam (the epic of Kallikkadu, in literal translation) is one of the novels written by the eminent Vairamuthu. It tells the agonising tale of a marginal farmer of a riverbed region of the Theni belt in southern Tamil Nadu. Kallikattu Ithikasam - a confluence of various emotions like sadness, sufferings and depression—crammed his mind for more than four decades. Finally, when it exploded, the natives of `Kallikadugal' found their biographies in the book. But with a silver lining. The novel won him the Sahitya Akademi award for Best Literary Work in 2003."));
		books.add(new Book(++idCounter, "moonram.jpg", "Moondram Ulaga Por", "Vairamuthu", "Rs.300", 4,
				"Even now a war is going on. But this war is not face to face. This war is waged with hidden weapons. It is a war between the sky and the earth. War waged on the people and the nature. The world has not seen a war of this kind before. This is the war waged by global warming and globalisation against agriculture."));
		books.add(new Book(++idCounter, "nokki.jpg", "Sigarangalai Nokki", "Vairamuthu", "Rs.300", 4,
				"This book emphasizes on people moving against nature or nowadays ignoring natural laws and beauties. It carefully crafted highlighting the importance of pursuing hardwork in any job we do and also should take our time out to admire beauty of nature."));
		books.add(new Book(++idCounter, "thaneer.jpg", "Thanneer Desam", "Vairamuthu", "Rs.300", 4,
				"This work is about the 'sea odyssey'. Kalaivannan is the hero; Tamilroja is the heroine. A lot of scientific facts about the sea, water, and the universe are sown in this modern poetry(pudhuk kavidhai). The work depicts the adventure of fishermen's life at sea."));
		books.add(new Book(++idCounter, "vin.jpg", "Vignana sirukathaigal", "Sujatha", "Rs.300", 5,
				"This sturdy volume carries 50 sci-fi short stories of Sujatha published in various Tamil magazines. Apart from his unique style of writing, the stories are laced with humour. Sujatha’s use of Tamil is completely different from the way it is used by other story tellers."));
		books.add(new Book(++idCounter, "syl.jpg", "Sylvia", "Sujatha", "Rs.300", 4,
				"This has a novella and seven short stories."));
		books.add(new Book(++idCounter, "stuff.jpg",
				"Stuff Matters: Exploring the Marvelous Materials That Shape Our Man-Made World", "Mark Miodownik",
				"Rs.300", 5,
				"An eye-opening adventure deep inside the everyday materials that surround us, packed with surprising stories and fascinating science. Why is glass see-through? What makes elastic stretchy? Why does a paper clip bend? Why does any material look and behave the way it does? These are the sorts of questions that Mark Miodownik is constantly asking himself. A globally-renowned materials scientist, Miodownik has spent his life exploring objects as ordinary as an envelope and as unexpected as concrete cloth, uncovering the fascinating secrets that hold together our physical world."));
	}

	public int GetBooksCount() {
		return books.size();
	}

	public List<Book> GetBooks(int pageNumber, int limit) {
		int startNum = (pageNumber - 1) * limit;
		int endNum = pageNumber * limit;

		List<Book> lstBookSlice = new ArrayList();

		if (endNum > books.size())
			endNum = books.size();

		for (int i = startNum; i < endNum; i++) {
			Book bk = books.get(i);
			lstBookSlice.add(bk);
		}

		return lstBookSlice;
	}

	public BookDetailsDto GetBookDetails(int bookId) {
		BookDetailsDto bkDetails = new BookDetailsDto();

		// Sanity checks...
		if (bookId < 0)
			return bkDetails;

		if (bookId > books.size())
			return bkDetails;

		List<Book> booksById = books.stream().filter(b -> b.getId() == bookId).collect(Collectors.toList());

		if (booksById.size() <= 0)
			return bkDetails;

		Book bk = booksById.get(0);
		bkDetails.setBook(bk);

		List<Book> booksBySameAuthor = books.stream()
				.filter(b -> b.getId() != bookId && b.getAuthor() == bk.getAuthor()).collect(Collectors.toList());
		bkDetails.setBooksFromAuthor(booksBySameAuthor);

		return bkDetails;
	}
}

