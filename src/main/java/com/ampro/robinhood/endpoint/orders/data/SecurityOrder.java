package com.ampro.robinhood.endpoint.orders.data;

import com.ampro.robinhood.endpoint.ApiElement;
import com.ampro.robinhood.endpoint.orders.enums.OrderState;
import com.ampro.robinhood.util.ChronoFormatter;

import java.net.URL;
import java.time.ZonedDateTime;
import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class SecurityOrder.
 */
public class SecurityOrder implements ApiElement {

	/** The updated at. */
	private String updated_at;
	
	/** The executions. */
	private Execution[] executions;
	/**
	 * Total fees incurred. Normally this is 0.00 - Robinhood just likes to
	 * flaunt the fact
	 */
	private float fees;

	/** If this is not NULL, you can POST to this URL to cancel the order. */
	private URL cancel;

	/** The internal ID of this order. */
	private String id;

	/** The number of shares which have executed so far. */
	private float cumulative_quantity;

	/**
	 * A String description of why the order was rejected. This can also be NULL
	 */
	private String reject_reason;

	/**
	 * The state of the order. This is returned as an {@link OrderState} enum in the getter
	 */
	private String state;

	/** The last transaction at. */
	private String last_transaction_at;

	/** The client id. */
	private String client_id;

	/**  A link to this order with up to date information. */
	private URL url;

	/** The created at. */
	private String created_at;

	/**  A link to positions for this account with this instrument. */
	private URL position;

	/**  Average price for all shares executed so far. */
	private float average_price;

	/** Should this execute after the exchanges are closed? Only really returns true if you have Robinhood Gold. */
	private boolean extended_hours;

	/**  Do you have pattern day trading checking enabled?. */
	private boolean override_day_trade_checks;

	/** The override dtbp checks. */
	private boolean override_dtbp_checks;
	
	/** The ref id. */
	private String ref_id;
	
	/** The time in force. */
	private String time_in_force;
	
	/** The response category. */
	private String response_category;
	
	/** The stop price. */
	private double stop_price;
	
	/** The instrument. */
	private String instrument;
	
	/** The trigger. */
	private String trigger;
	
	/** The type. */
	private String type;
	
	/** The price. */
	private double price;
	

	/* (non-Javadoc)
	 * @see com.ampro.robinhood.endpoint.ApiElement#requiresAuth()
	 */
	@Override
	public boolean requiresAuth() { return true; }

	/**
	 * Gets the updated at.
	 *
	 * @return the updated at
	 */
	public ZonedDateTime getUpdatedAt() {
		return ChronoFormatter.parseDefault(this.updated_at);
	}

	/**
	 * Gets the created at.
	 *
	 * @return the created at
	 */
	public ZonedDateTime getCreatedAt() {
		return ChronoFormatter.parseDefault(this.created_at);
	}

	/**
	 * Gets the last transaction at.
	 *
	 * @return the last transaction at
	 */
	public ZonedDateTime getLastTransactionAt() {
		return ChronoFormatter.parseDefault(this.last_transaction_at);
	}

	/**
	 * Gets the executions.
	 *
	 * @return the executions
	 */
	public Execution[] getExecutions() {
		return executions;
	}

	/**
	 * Gets the fees.
	 *
	 * @return the fees
	 */
	public float getFees() {
		return fees;
	}

	/**
	 * Gets the cancel.
	 *
	 * @return the cancel
	 */
	public URL getCancel() {
		return cancel;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Gets the cumulative quantity.
	 *
	 * @return the cumulative_quantity
	 */
	public float getCumulativeQuantity() {
		return cumulative_quantity;
	}

	/**
	 * Gets the reject reason.
	 *
	 * @return the reject_reason
	 */
	public String getRejectReason() {
		return reject_reason;
	}

	/**
	 * Gets the transaction state.
	 *
	 * @return the state as an ENUM value representing each possible response. See {@link OrderState}
	 */
	public OrderState getTransactionState() {
		return OrderState.parse(this.state);
	}

	/**
	 * Gets the transaction state as string.
	 *
	 * @return the state of the transaction as a readable string.
	 */
	public String getTransactionStateAsString() {
		return this.state;
	}

	/**
	 * Gets the client id.
	 *
	 * @return the client_id
	 */
	public String getClientId() {
		return client_id;
	}

	/**
	 * Gets the url.
	 *
	 * @return the url
	 */
	public URL getUrl() {
		return url;
	}

	/**
	 * Gets the position.
	 *
	 * @return the position
	 */
	public URL getPosition() {
		return position;
	}

	/**
	 * Gets the average price.
	 *
	 * @return the average_price
	 */
	public float getAveragePrice() {
		return average_price;
	}

	/**
	 * Checks if is extended hours.
	 *
	 * @return the extended_hours
	 */
	public boolean isExtendedHours() {
		return extended_hours;
	}

	/**
	 * Does override day trade checks.
	 *
	 * @return the override_day_trade_checks
	 */
	public boolean doesOverrideDayTradeChecks() {
		return override_day_trade_checks;
	}

	/**
	 * Does override dtbp checks.
	 *
	 * @return the override_dtbp_checks
	 */
	public boolean doesOverrideDtbpChecks() {
		return override_dtbp_checks;
	}



  /**
   * Gets the state.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

 
  /**
   * Gets the ref id.
   *
   * @return the ref id
   */
  public String getRefId() {
    return ref_id;
  }

  /**
   * Gets the time in force.
   *
   * @return the time in force
   */
  public String getTimeInForce() {
    return time_in_force;
  }

  /**
   * Gets the response category.
   *
   * @return the response category
   */
  public String getResponseCategory() {
    return response_category;
  }

  /**
   * Gets the stop price.
   *
   * @return the stop price
   */
  public double getStopPrice() {
    return stop_price;
  }

  /**
   * Gets the instrument.
   *
   * @return the instrument
   */
  public String getInstrument() {
    return instrument;
  }

  /**
   * Gets the trigger.
   *
   * @return the trigger
   */
  public String getTrigger() {
    return trigger;
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the price.
   *
   * @return the price
   */
  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "SecurityOrder [updated_at=" + updated_at + ", executions=" + Arrays.toString(executions)
        + ", fees=" + fees + ", cancel=" + cancel + ", id=" + id + ", cumulative_quantity="
        + cumulative_quantity + ", reject_reason=" + reject_reason + ", state=" + state
        + ", last_transaction_at=" + last_transaction_at + ", client_id=" + client_id + ", url="
        + url + ", created_at=" + created_at + ", position=" + position + ", average_price="
        + average_price + ", extended_hours=" + extended_hours + ", override_day_trade_checks="
        + override_day_trade_checks + ", override_dtbp_checks=" + override_dtbp_checks + ", ref_id="
        + ref_id + ", time_in_force=" + time_in_force + ", response_category=" + response_category
        + ", stop_price=" + stop_price + ", instrument=" + instrument + ", trigger=" + trigger
        + ", type=" + type + ", price=" + price + "]";
  }

}
