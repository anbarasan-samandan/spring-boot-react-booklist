import axios from "axios";

const baseUrl = process.env.API_URL;
const pageSize = 10;

class BooksListService {
  getAllBooks(pageNumber) {
    return axios({
      method: "GET",
      url: `${baseUrl}/books/`,
      params: { page: pageNumber, limit: pageSize },
    });
  }

  getBookDetails(bookId) {
    return axios({
      method: "GET",
      url: `${process.env.API_URL}/books/` + bookId,
    });
  }
}

export default new BooksListService();
