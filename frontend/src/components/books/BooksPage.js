import { useEffect, useState } from "react";
import * as constants from "../common/constants";
import BooksListService from "../../api/BooksListService.js";

/*
 * A functional component encompasses the logic for fetching the books from
 * the server...
 */
function booksPage(pageNumber) {
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(false);
  const [books, setBooks] = useState([]);
  const [bookCount, setBookCount] = useState(0);
  const [hasMore, setHasMore] = useState(false);

  /*
   * Fetches the books list and the total count of the books from the server.
   * The total count of the books is required to determine whether all the
   * books has been fetched from the server.
   */
  useEffect(() => {
    setLoading(true);
    setError(false);

    BooksListService.getAllBooks(pageNumber)
      .then((res) => {
        setBookCount(() => {
          return res.data.count;
        });

        setBooks((prevBooks) => {
          if (bookCount > 0) {
            return [...new Set([...prevBooks, ...res.data.books])];
          } else {
            setBooks([]);
          }
        });

        let currentBookCount = pageNumber * constants.PAGE_SIZE;
        let isMoreBooks = bookCount > currentBookCount;

        setHasMore(isMoreBooks);

        setLoading(false);
      })
      .catch((e) => {
        console.log(e);
        setError(true);
      });
  }, [bookCount > 0, pageNumber]);
  return { loading, error, books, hasMore, bookCount };
}

export default booksPage;
